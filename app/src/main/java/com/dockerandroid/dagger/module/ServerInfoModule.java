/*
 * Copyright (c) 2016 saymagic <saymagic.dev@gmail.com>
 *
 * This file is a part of project DockerAndroid
 *
 * Licensed under the Apache License, Version 2.0 (the "License”);
 */
package com.dockerandroid.dagger.module;

import com.dockerandroid.data.DataManager;
import com.dockerandroid.presenters.ServerInfoPresenter;
import com.dockerandroid.presenters.impl.ServerInfoPresenterImpl;

import dagger.Module;
import dagger.Provides;

/**
 * Created by saymagic on 2016/2/20.
 */
@Module
public class ServerInfoModule {

    @Provides
    ServerInfoPresenter provideContainerPresenter(DataManager manager) {
        return new ServerInfoPresenterImpl(manager);
    }

}
