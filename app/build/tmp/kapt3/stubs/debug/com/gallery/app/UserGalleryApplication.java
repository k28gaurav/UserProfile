package com.gallery.app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000bH\u0014J\b\u0010\f\u001a\u00020\rH\u0016R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u000f"}, d2 = {"Lcom/gallery/app/UserGalleryApplication;", "Ldagger/android/support/DaggerApplication;", "()V", "<set-?>", "Lcom/gallery/app/di/AppComponent;", "appComponent", "getAppComponent", "()Lcom/gallery/app/di/AppComponent;", "setAppComponent", "(Lcom/gallery/app/di/AppComponent;)V", "applicationInjector", "Ldagger/android/AndroidInjector;", "onCreate", "", "Companion", "app_debug"})
public final class UserGalleryApplication extends dagger.android.support.DaggerApplication {
    @org.jetbrains.annotations.NotNull()
    private com.gallery.app.di.AppComponent appComponent;
    @org.jetbrains.annotations.NotNull()
    public static com.gallery.app.UserGalleryApplication app;
    public static final com.gallery.app.UserGalleryApplication.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.gallery.app.di.AppComponent getAppComponent() {
        return null;
    }
    
    private final void setAppComponent(com.gallery.app.di.AppComponent p0) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected dagger.android.AndroidInjector<? extends dagger.android.support.DaggerApplication> applicationInjector() {
        return null;
    }
    
    public UserGalleryApplication() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@@X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/gallery/app/UserGalleryApplication$Companion;", "", "()V", "<set-?>", "Lcom/gallery/app/UserGalleryApplication;", "app", "getApp", "()Lcom/gallery/app/UserGalleryApplication;", "setApp$app_debug", "(Lcom/gallery/app/UserGalleryApplication;)V", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.gallery.app.UserGalleryApplication getApp() {
            return null;
        }
        
        public final void setApp$app_debug(@org.jetbrains.annotations.NotNull()
        com.gallery.app.UserGalleryApplication p0) {
        }
        
        private Companion() {
            super();
        }
    }
}