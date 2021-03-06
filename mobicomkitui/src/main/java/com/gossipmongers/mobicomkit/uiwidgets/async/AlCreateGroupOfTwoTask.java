package com.gossipmongers.mobicomkit.uiwidgets.async;

import android.content.Context;

import com.gossipmongers.mobicomkit.api.account.user.MobiComUserPreference;
import com.gossipmongers.mobicomkit.api.people.ChannelInfo;
import com.gossipmongers.mobicomkit.channel.service.ChannelService;
import com.gossipmongers.mobicommons.people.channel.Channel;
import com.gossipmongers.mobicommons.task.AlAsyncTask;

/**
 * Created by mihir on 20/03/18.
 */

public class AlCreateGroupOfTwoTask extends AlAsyncTask<Void, Channel> {
    Context context;
    ChannelService channelService;
    ChannelInfo channelInfo;
    TaskListenerInterface taskListenerInterface;

    public AlCreateGroupOfTwoTask(Context context, ChannelInfo channelInfo, TaskListenerInterface taskListenerInterface) {
        this.context = context;
        this.taskListenerInterface = taskListenerInterface;
        this.channelInfo = channelInfo;
        this.channelService = ChannelService.getInstance(context);
    }

    public AlCreateGroupOfTwoTask(Context context, ChannelInfo channelInfo, String userReceiver, String itemID, TaskListenerInterface taskListenerInterface) {
        this.context = context;
        this.taskListenerInterface = taskListenerInterface;
        this.channelInfo = channelInfo;
        this.channelInfo.setClientGroupId(buildClientGroupID(itemID, userReceiver));
        this.channelService = ChannelService.getInstance(context);
    }

    @Override
    protected Channel doInBackground() {
        if (channelInfo != null) {
            return channelService.createGroupOfTwo(channelInfo);
        }
        return null;
    }

    @Override
    protected void onPostExecute(Channel channel) {
        super.onPostExecute(channel);
        if (channel != null) {
            taskListenerInterface.onSuccess(channel, context);
        } else {
            taskListenerInterface.onFailure("Some error occured", context);
        }
    }

    public interface TaskListenerInterface {
        void onSuccess(Channel channel, Context context);

        void onFailure(String error, Context context);
    }

    private String buildClientGroupID(String itemID, String receiverID) {
        return (MobiComUserPreference.getInstance(context).getUserId() + itemID + receiverID);
    }
}