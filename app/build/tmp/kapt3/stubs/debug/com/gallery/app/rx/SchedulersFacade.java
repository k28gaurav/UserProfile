package com.gallery.app.rx;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016\u00a8\u0006\u0007"}, d2 = {"Lcom/gallery/app/rx/SchedulersFacade;", "Lcom/gallery/app/rx/SchedulerProvider;", "()V", "computation", "Lio/reactivex/Scheduler;", "io", "ui", "app_debug"})
public final class SchedulersFacade implements com.gallery.app.rx.SchedulerProvider {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Scheduler io() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Scheduler computation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Scheduler ui() {
        return null;
    }
    
    @javax.inject.Inject()
    public SchedulersFacade() {
        super();
    }
}