package com.kodluyoruz.hungryapp;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = HungryApp.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface HungryApp_GeneratedInjector {
  void injectHungryApp(HungryApp hungryApp);
}
