package com.gallery.app.viewmodel

import com.gallery.app.base.BaseViewModel
import com.gallery.app.rx.SchedulersFacade
import javax.inject.Inject

class UserDetailsViewModel @Inject constructor(schedulersFacade: SchedulersFacade) : BaseViewModel(schedulersFacade) {

}