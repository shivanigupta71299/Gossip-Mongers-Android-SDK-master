package com.gossipmongers.mobicomkit.uiwidgets.async;

import android.content.Context;

import com.gossipmongers.mobicomkit.api.people.ChannelInfo;
import com.gossipmongers.mobicomkit.channel.service.ChannelService;
import com.gossipmongers.mobicomkit.feed.ChannelFeedApiResponse;
import com.gossipmongers.mobicommons.people.channel.Channel;
import com.gossipmongers.mobicommons.task.AlAsyncTask;

/**
 * Created by Sunil on 12/26/2016.
 */

public class AlChannelCreateAsyncTask extends AlAsyncTask<Void, ChannelFeedApiResponse> {
    Context context;
    ChannelService channelService;
    ChannelInfo channelInfo;
    TaskListenerInterface taskListenerInterface;

    public AlChannelCreateAsyncTask(Context context, ChannelInfo channelInfo, TaskListenerInterface taskListenerInterface) {
        this.context = context;
        this.taskListenerInterface = taskListenerInterface;
        this.channelInfo = channelInfo;
        this.channelService = ChannelService.getInstance(context);
    }

    @Override
    protected ChannelFeedApiResponse doInBackground() {
        if (channelInfo != null) {
            return channelService.createChannelWithResponse(channelInfo);
        }
        return null;
    }

    @Override
    protected void onPostExecute(ChannelFeedApiResponse channelFeedApiResponse) {
        super.onPostExecute(channelFeedApiResponse);
        if (channelFeedApiResponse != null) {
            if (channelFeedApiResponse.isSuccess()) {
                taskListenerInterface.onSuccess(channelService.getChannel(channelFeedApiResponse.getResponse()), context);
            } else {
                taskListenerInterface.onFailure(channelFeedApiResponse, context);
            }
        } else {
            taskListenerInterface.onFailure(channelFeedApiResponse, context);
        }
    }

    public interface TaskListenerInterface {
        void onSuccess(Channel channel, Context context);

        void onFailure(ChannelFeedApiResponse channelFeedApiResponse, Context context);
    }
}
