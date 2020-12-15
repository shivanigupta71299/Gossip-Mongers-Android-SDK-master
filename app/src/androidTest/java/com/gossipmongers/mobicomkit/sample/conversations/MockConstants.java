package com.gossipmongers.mobicomkit.sample.conversations;

public class MockConstants {

    //login with androidTestUser1
    public static final String getLatestMessageListResponse_WithNoArgs = "[{createdAtTime=1539700370769, to='androidTestUser2', message='q', key='5-12711281-1539700370759', deviceKey='null', userKey='null', emailIds='null', shared=false, sent=false, delivered=false, type=4, storeOnDevice=false, contactIds='androidTestUser2', groupId=12711281, sendToDevice=false, scheduledAt=null, source=1, timeToLive=null, sentToServer=true, fileMetaKey='null', filePaths=null, pairedMessageKey='null', sentMessageTimeAtServer=0, canceled=false, clientGroupId='null', fileMeta=null, messageId=415, read=true, attDownloadInProgress=false, applicationId='null', conversationId=null, topicId='null', connected=false, contentType=0, metadata={}, status=1}, {createdAtTime=1539700097304, to='androidTestUser1', message='Group name changed to aaonlyGroup', key='5-12711281-1539700097295', deviceKey='null', userKey='null', emailIds='null', shared=false, sent=false, delivered=true, type=5, storeOnDevice=false, contactIds='androidTestUser1', groupId=12711281, sendToDevice=false, scheduledAt=null, source=2, timeToLive=null, sentToServer=true, fileMetaKey='null', filePaths=null, pairedMessageKey='null', sentMessageTimeAtServer=0, canceled=false, clientGroupId='null', fileMeta=null, messageId=414, read=true, attDownloadInProgress=false, applicationId='null', conversationId=null, topicId='null', connected=false, contentType=10, metadata={action=5}, status=5}, {createdAtTime=1539698701211, to='androidTestUser2', message='androidTestUser2 added androidTestUser1', key='5-12711281-1539698701203', deviceKey='null', userKey='null', emailIds='null', shared=false, sent=false, delivered=false, type=4, storeOnDevice=false, contactIds='androidTestUser2', groupId=12711281, sendToDevice=false, scheduledAt=null, source=1, timeToLive=null, sentToServer=true, fileMetaKey='null', filePaths=null, pairedMessageKey='null', sentMessageTimeAtServer=0, canceled=false, clientGroupId='null', fileMeta=null, messageId=411, read=true, attDownloadInProgress=false, applicationId='null', conversationId=null, topicId='null', connected=false, contentType=10, metadata={action=1}, status=1}, {createdAtTime=1539698620069, to='androidTestUser2', message='ok', key='4-a9a96701-edf2-4add-9f9f-8af52036f11e-1539698620016', deviceKey='null', userKey='null', emailIds='null', shared=false, sent=false, delivered=false, type=4, storeOnDevice=false, contactIds='androidTestUser2', groupId=null, sendToDevice=false, scheduledAt=null, source=1, timeToLive=null, sentToServer=true, fileMetaKey='null', filePaths=null, pairedMessageKey='null', sentMessageTimeAtServer=0, canceled=false, clientGroupId='null', fileMeta=null, messageId=410, read=true, attDownloadInProgress=false, applicationId='null', conversationId=null, topicId='null', connected=false, contentType=0, metadata={}, status=1}]";

    public static final String getLatestMessageListResponse_WithSearchString = "[{createdAtTime=1539698601266, to='androidTestUser2', message='shivam', key='4-a9a96701-edf2-4add-9f9f-8af52036f11e-1539698601220', deviceKey='null', userKey='null', emailIds='null', shared=false, sent=false, delivered=false, type=4, storeOnDevice=false, contactIds='androidTestUser2', groupId=null, sendToDevice=false, scheduledAt=null, source=1, timeToLive=null, sentToServer=true, fileMetaKey='null', filePaths=null, pairedMessageKey='null', sentMessageTimeAtServer=0, canceled=false, clientGroupId='null', fileMeta=null, messageId=409, read=true, attDownloadInProgress=false, applicationId='null', conversationId=null, topicId='null', connected=false, contentType=0, metadata={}, status=1}]";

    public static final String getLatestMessageListResponse_WithWrongArgs = "[]";

    public static final String getMessagesForContactResponse = "[{createdAtTime=1539698601266, to='androidTestUser2', message='shivam', key='4-a9a96701-edf2-4add-9f9f-8af52036f11e-1539698601220', deviceKey='null', userKey='null', emailIds='null', shared=false, sent=false, delivered=false, type=4, storeOnDevice=false, contactIds='androidTestUser2', groupId=null, sendToDevice=false, scheduledAt=null, source=1, timeToLive=null, sentToServer=true, fileMetaKey='null', filePaths=null, pairedMessageKey='null', sentMessageTimeAtServer=0, canceled=false, clientGroupId='null', fileMeta=null, messageId=409, read=true, attDownloadInProgress=false, applicationId='null', conversationId=null, topicId='null', connected=false, contentType=0, metadata={}, status=1}, {createdAtTime=1539698620069, to='androidTestUser2', message='ok', key='4-a9a96701-edf2-4add-9f9f-8af52036f11e-1539698620016', deviceKey='null', userKey='null', emailIds='null', shared=false, sent=false, delivered=false, type=4, storeOnDevice=false, contactIds='androidTestUser2', groupId=null, sendToDevice=false, scheduledAt=null, source=1, timeToLive=null, sentToServer=true, fileMetaKey='null', filePaths=null, pairedMessageKey='null', sentMessageTimeAtServer=0, canceled=false, clientGroupId='null', fileMeta=null, messageId=410, read=true, attDownloadInProgress=false, applicationId='null', conversationId=null, topicId='null', connected=false, contentType=0, metadata={}, status=1}]";

    public static final String getMessagesForGroupResponse = "[{createdAtTime=1539698691367, to='androidTestUser2', message='androidTestUser2 created group onlyGroup', key='5-12711281-1539698691360', deviceKey='null', userKey='null', emailIds='null', shared=false, sent=false, delivered=false, type=4, storeOnDevice=false, contactIds='androidTestUser2', groupId=12711281, sendToDevice=false, scheduledAt=null, source=1, timeToLive=null, sentToServer=true, fileMetaKey='null', filePaths=null, pairedMessageKey='null', sentMessageTimeAtServer=0, canceled=false, clientGroupId='null', fileMeta=null, messageId=412, read=true, attDownloadInProgress=false, applicationId='null', conversationId=null, topicId='null', connected=false, contentType=10, metadata={action=0}, status=1}, {createdAtTime=1539698701211, to='androidTestUser2', message='androidTestUser2 added androidTestUser1', key='5-12711281-1539698701203', deviceKey='null', userKey='null', emailIds='null', shared=false, sent=false, delivered=false, type=4, storeOnDevice=false, contactIds='androidTestUser2', groupId=12711281, sendToDevice=false, scheduledAt=null, source=1, timeToLive=null, sentToServer=true, fileMetaKey='null', filePaths=null, pairedMessageKey='null', sentMessageTimeAtServer=0, canceled=false, clientGroupId='null', fileMeta=null, messageId=411, read=true, attDownloadInProgress=false, applicationId='null', conversationId=null, topicId='null', connected=false, contentType=10, metadata={action=1}, status=1}, {createdAtTime=1539698703394, to='androidTestUser2', message='baby', key='5-12711281-1539698703387', deviceKey='null', userKey='null', emailIds='null', shared=false, sent=false, delivered=false, type=4, storeOnDevice=false, contactIds='androidTestUser2', groupId=12711281, sendToDevice=false, scheduledAt=null, source=1, timeToLive=null, sentToServer=true, fileMetaKey='null', filePaths=null, pairedMessageKey='null', sentMessageTimeAtServer=0, canceled=false, clientGroupId='null', fileMeta=null, messageId=413, read=true, attDownloadInProgress=false, applicationId='null', conversationId=null, topicId='null', connected=false, contentType=0, metadata={}, status=1}, {createdAtTime=1539700097304, to='androidTestUser1', message='Group name changed to aaonlyGroup', key='5-12711281-1539700097295', deviceKey='null', userKey='null', emailIds='null', shared=false, sent=false, delivered=true, type=5, storeOnDevice=false, contactIds='androidTestUser1', groupId=12711281, sendToDevice=false, scheduledAt=null, source=2, timeToLive=null, sentToServer=true, fileMetaKey='null', filePaths=null, pairedMessageKey='null', sentMessageTimeAtServer=0, canceled=false, clientGroupId='null', fileMeta=null, messageId=414, read=true, attDownloadInProgress=false, applicationId='null', conversationId=null, topicId='null', connected=false, contentType=10, metadata={action=5}, status=5}, {createdAtTime=1539700370769, to='androidTestUser2', message='q', key='5-12711281-1539700370759', deviceKey='null', userKey='null', emailIds='null', shared=false, sent=false, delivered=false, type=4, storeOnDevice=false, contactIds='androidTestUser2', groupId=12711281, sendToDevice=false, scheduledAt=null, source=1, timeToLive=null, sentToServer=true, fileMetaKey='null', filePaths=null, pairedMessageKey='null', sentMessageTimeAtServer=0, canceled=false, clientGroupId='null', fileMeta=null, messageId=415, read=true, attDownloadInProgress=false, applicationId='null', conversationId=null, topicId='null', connected=false, contentType=0, metadata={}, status=1}]";

    public static final String Message = "{createdAtTime=1540200629140, to='null', message='', key='5-12711281-1540200629140', deviceKey='cea86679-9b3c-45e2-a297-1c4e71a76699', userKey='48c57e74-6412-4373-8959-8b59cdbd6da3', emailIds='null', shared=false, sent=true, delivered=null, type=5, storeOnDevice=true, contactIds='', groupId=12711281, sendToDevice=false, scheduledAt=null, source=2, timeToLive=null, sentToServer=true, fileMetaKey='null', filePaths=null, pairedMessageKey='null', sentMessageTimeAtServer=1540200619561, canceled=false, clientGroupId='12711281', fileMeta={key='null', userKey='null', blobKey='AMIfv941L2pMd_gBHFAkP03JkUEIOfY5bj8bUDAkc_DoDvPoNasdf8yqXLyc6s9faUgbDrYt-TOvITdwtLRZkvKdLpSP-Np74CHwe4HWx9yU-ihNikMxaa0wh7tJsIEt2_OXY_HXFEGL_n9wjOPD4K009Ofccjsd0f1x3nAg', thumbnailBlobKey='null', url=null, name='20181022_678150024.jpg', size=104639, contentType='image/jpeg', thumbnailUrl='https://lh3.googleusercontent.com/oigz9w0ryj-PDjyb849NafsdaI-Lub8Q9QTPnKKwInWEDFDsfJzFe3RzoM2RI3Jqh83nM0aP-7AebpNx2EYziR_O-=s120', createdAtTime=15402010615966}, messageId=416, read=true, attDownloadInProgress=false, applicationId='null', conversationId=null, topicId='null', connected=false, contentType=1, metadata={}, status=1}";

    public static final String MessageWithFilePath = "{\"attDownloadInProgress\":false,\"canceled\":false,\"clientGroupId\":\"12711281\",\"connected\":false,\"contentType\":1,\"createdAtTime\":\"\",\"delivered\":false,\"fileMeta\":{\"blobKey\":\"AMIfv941L2pMd_gBHFAkP03JkUEIOfY5bj8bUDAkc_DoDvPoN8yqXLyc6s9faUgbDrYt-TOvITdwtLRZkvKdLpSP-Np74CHwe4HWx9yU-ihNikMx0wh7tJsIEt2_OXY_HXFEGL_n9wjOPD4K009Ofccjsd0f1x3nAg\",\"contentType\":\"image/jpeg\",\"name\":\"20181022_1500241540200619561.jpg\",\"size\":104639,\"thumbnailUrl\":\"https://lh3.googleusercontent.com/oigz9w0ryj-PDjyb849NI-Lub8Q9QTPnKKwInWEDFDsfJzFe3RzoM2RI3Jqh83nM0aP-7AebpNx2EYziR_O-\\u003ds120\"},\"filePaths\":[\"/storage/emulated/0/Applozic/image/20181022_1500241540200619561.jpg\"],\"groupId\":12711281,\"hidden\":false,\"key\":\"5-12711281-1540200629140\",\"message\":\"\",\"id\":416,\"metadata\":{},\"read\":true,\"replyMessage\":0,\"sendToDevice\":false,\"sent\":false,\"sentMessageTimeAtServer\":0,\"sentToServer\":true,\"shared\":false,\"source\":2,\"status\":1,\"storeOnDevice\":true,\"type\":5}";
}
