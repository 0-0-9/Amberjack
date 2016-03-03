/*
 * Copyright (c) 2016 saymagic <saymagic.dev@gmail.com>
 *
 * This file is a part of project DockerAndroid
 *
 * Licensed under the Apache License, Version 2.0 (the "License”);
 */
package com.dockerandroid.views;

/**
 * Created by saymagic on 16/2/3.
 */
public interface ILoadingView extends IView {

    public void startLoading();

    public void stopLoading();
}
