package com.gossipmongers.mobicomkit.uiwidgets.conversation.richmessaging.callbacks;

import android.content.Context;

import com.gossipmongers.mobicomkit.api.conversation.Message;

import java.util.Map;

/**
 * Created by ashish on 05/03/18.
 */

public interface ALRichMessageListener {
    void onAction(Context context, String action, Message message, Object object, Map<String, Object> replyMetadata);
}
