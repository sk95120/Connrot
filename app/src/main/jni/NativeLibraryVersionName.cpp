// Created by shike on 10/27/2019.

#define __cplusplus 201103L
#include "com_example_ShikeApplication_ndkdemo_ndktool.h"
#include <jni.h>
#include <string.h>
#include <pthread.h>

#include "MainConnrotNativeThread.c"

#ifdef __cplusplus
extern "C" {
#endif
    JNIEXPORT jstring JNICALL
    Java_com_example_ShikeApplication_ndkdemo_ndktool_getNativeLibraryVersion
    (JNIEnv *env, jobject obj) {
        return env->NewStringUTF("内核版本号:001.19.10.27.1001");
    }
#ifdef __cplusplus
}
#endif

pthread_t countTimeThread;

//void *threadCallBack(void *)
//{
//
//}

extern "C"
JNIEXPORT void JNICALL
Java_com_example_ShikeApplication_ndkdemo_ndktool_startNativeThreadDemoOne(JNIEnv *env,
                                                                           jclass clazz) {
//    pthread_create(&countTimeThread,NULL,threadCallBack,NULL);
}