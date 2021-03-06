package com.gossipmongers.mobicomkit.uiwidgets.async;

import android.content.Context;
import android.text.TextUtils;

import com.gossipmongers.mobicomkit.api.MobiComKitConstants;
import com.gossipmongers.mobicomkit.channel.service.ChannelService;
import com.gossipmongers.mobicomkit.uiwidgets.R;
import com.gossipmongers.mobicommons.task.AlAsyncTask;

/**
 * Created by sunil on 17/5/16.
 */
public class ApplozicChannelRemoveMemberTask extends AlAsyncTask<Void, Boolean> {

    Context context;
    Integer channelKey;
    String userId;
    ChannelRemoveMemberListener channelRemoveMemberListener;
    ChannelService channelService;
    Exception exception;
    String removeResponse;

    public ApplozicChannelRemoveMemberTask(Context context, Integer channelKey, String userId, ChannelRemoveMemberListener channelRemoveMemberListener) {
        this.channelKey = channelKey;
        this.userId = userId;
        this.channelRemoveMemberListener = channelRemoveMemberListener;
        this.context = context;
        this.channelService = ChannelService.getInstance(context);
    }

    @Override
    protected Boolean doInBackground() {
        try {
            if (!TextUtils.isEmpty(userId) && userId.trim().length() != 0 && channelKey != null) {
                removeResponse = channelService.removeMemberFromChannelProcess(channelKey, userId.trim());
                if (!TextUtils.isEmpty(removeResponse)) {
                    return MobiComKitConstants.SUCCESS.equals(removeResponse);
                }
            } else {
                throw new Exception(context.getString(R.string.applozic_userId_error_info_in_logs));
            }
        } catch (Exception e) {
            e.printStackTrace();
            exception = e;
            return false;
        }
        return false;
    }

    @Override
    protected void onPostExecute(Boolean resultBoolean) {
        super.onPostExecute(resultBoolean);

        if (resultBoolean && channelRemoveMemberListener != null) {
            channelRemoveMemberListener.onSuccess(removeResponse, context);
        } else if (!resultBoolean && exception != null && channelRemoveMemberListener != null) {
            channelRemoveMemberListener.onFailure(removeResponse, exception, context);
        }
    }

    public interface ChannelRemoveMemberListener {
        void onSuccess(String response, Context context);

        void onFailure(String response, Exception e, Context context);
    }
}
