package com.gossipmongers.mobicomkit.uiwidgets.async;

import android.content.Context;

import com.gossipmongers.mobicomkit.api.conversation.service.ConversationService;
import com.gossipmongers.mobicomkit.channel.service.ChannelService;
import com.gossipmongers.mobicommons.people.channel.Conversation;
import com.gossipmongers.mobicommons.task.AlAsyncTask;

/**
 * Created by sunil on 17/5/16.
 */
public class ApplozicConversationCreateTask extends AlAsyncTask<Void, Boolean> {
    Context context;
    ChannelService channelService;
    Exception exception;
    ConversationCreateListener conversationCreateListener;
    ConversationService conversationService;
    Conversation conversation;
    Integer conversationId;

    public ApplozicConversationCreateTask(Context context, ConversationCreateListener conversationCreateListener, Conversation conversation) {
        this.context = context;
        this.conversationCreateListener = conversationCreateListener;
        this.channelService = ChannelService.getInstance(context);
        this.conversationService = ConversationService.getInstance(context);
        this.conversation = conversation;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        if (conversation != null) {
            conversationId = conversationService.isConversationExist(conversation.getUserId(), conversation.getTopicId());
        }
    }

    @Override
    protected Boolean doInBackground() {
        try {
            if (conversationId == null) {
                conversationId = conversationService.createConversation(conversation);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            exception = e;
            return false;
        }
    }

    @Override
    protected void onPostExecute(Boolean resultBoolean) {
        super.onPostExecute(resultBoolean);
        if (resultBoolean && conversationId != null && conversationCreateListener != null) {
            conversationCreateListener.onSuccess(conversationId, context);
        } else if (exception != null && !resultBoolean && conversationCreateListener != null) {
            conversationCreateListener.onFailure(exception, context);
        }

    }

    public interface ConversationCreateListener {
        void onSuccess(Integer conversationId, Context context);

        void onFailure(Exception e, Context context);
    }
}