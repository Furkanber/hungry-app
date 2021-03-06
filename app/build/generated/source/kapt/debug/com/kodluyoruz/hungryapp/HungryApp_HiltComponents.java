package com.kodluyoruz.hungryapp;

import com.kodluyoruz.hungryapp.di.DatabaseModule;
import com.kodluyoruz.hungryapp.di.NetworkModule;
import com.kodluyoruz.hungryapp.ui.MainActivity_GeneratedInjector;
import com.kodluyoruz.hungryapp.ui.add_address.AddAddressFragment_GeneratedInjector;
import com.kodluyoruz.hungryapp.ui.add_address.AddAddressViewModel_HiltModules;
import com.kodluyoruz.hungryapp.ui.add_restaurant.AddRestaurantFragment_GeneratedInjector;
import com.kodluyoruz.hungryapp.ui.add_restaurant.AddRestaurantViewModel_HiltModules;
import com.kodluyoruz.hungryapp.ui.address_list.AddressListFragment_GeneratedInjector;
import com.kodluyoruz.hungryapp.ui.address_list.AddressListViewModel_HiltModules;
import com.kodluyoruz.hungryapp.ui.change_password.ChangePasswordFragment_GeneratedInjector;
import com.kodluyoruz.hungryapp.ui.change_password.ChangePasswordViewModel_HiltModules;
import com.kodluyoruz.hungryapp.ui.edit_profile.EditProfileFragment_GeneratedInjector;
import com.kodluyoruz.hungryapp.ui.edit_profile.EditProfileViewModel_HiltModules;
import com.kodluyoruz.hungryapp.ui.home.HomeFragmentViewModel_HiltModules;
import com.kodluyoruz.hungryapp.ui.home.HomeFragment_GeneratedInjector;
import com.kodluyoruz.hungryapp.ui.login.LoginFragment_GeneratedInjector;
import com.kodluyoruz.hungryapp.ui.login.LoginViewModel_HiltModules;
import com.kodluyoruz.hungryapp.ui.meal_adding.MealAddingFragment_GeneratedInjector;
import com.kodluyoruz.hungryapp.ui.meal_adding.MealAddingViewModel_HiltModules;
import com.kodluyoruz.hungryapp.ui.meal_detail.MealDetailFragment_GeneratedInjector;
import com.kodluyoruz.hungryapp.ui.meal_detail.MealDetailViewModel_HiltModules;
import com.kodluyoruz.hungryapp.ui.onboarding.MainOnBoardingFragment_GeneratedInjector;
import com.kodluyoruz.hungryapp.ui.order_history.OrderHistoryFragment_GeneratedInjector;
import com.kodluyoruz.hungryapp.ui.order_history.OrderHistoryViewModel_HiltModules;
import com.kodluyoruz.hungryapp.ui.profile.ProfileFragment_GeneratedInjector;
import com.kodluyoruz.hungryapp.ui.profile.ProfileViewModel_HiltModules;
import com.kodluyoruz.hungryapp.ui.register.RegisterFragment_GeneratedInjector;
import com.kodluyoruz.hungryapp.ui.register.RegisterViewModel_HiltModules;
import com.kodluyoruz.hungryapp.ui.restaurant_detail.RestaurantDetailFragment_GeneratedInjector;
import com.kodluyoruz.hungryapp.ui.restaurant_detail.RestaurantDetailViewModel_HiltModules;
import com.kodluyoruz.hungryapp.ui.splash.SplashFragment_GeneratedInjector;
import com.kodluyoruz.hungryapp.ui.splash.SplashViewModel_HiltModules;
import dagger.Binds;
import dagger.Component;
import dagger.Module;
import dagger.Subcomponent;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.components.FragmentComponent;
import dagger.hilt.android.components.ServiceComponent;
import dagger.hilt.android.components.ViewComponent;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.components.ViewWithFragmentComponent;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.HiltViewModelFactory;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_DefaultViewModelFactories_ActivityModule;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_HiltViewModelFactory_ViewModelModule;
import dagger.hilt.android.internal.managers.ActivityComponentManager;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_LifecycleModule;
import dagger.hilt.android.internal.managers.ServiceComponentManager;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.HiltWrapper_ActivityModule;
import dagger.hilt.android.scopes.ActivityRetainedScoped;
import dagger.hilt.android.scopes.ActivityScoped;
import dagger.hilt.android.scopes.FragmentScoped;
import dagger.hilt.android.scopes.ServiceScoped;
import dagger.hilt.android.scopes.ViewModelScoped;
import dagger.hilt.android.scopes.ViewScoped;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedComponent;
import dagger.hilt.migration.DisableInstallInCheck;
import javax.inject.Singleton;

public final class HungryApp_HiltComponents {
  private HungryApp_HiltComponents() {
  }

  @Module(
      subcomponents = ServiceC.class
  )
  @DisableInstallInCheck
  abstract interface ServiceCBuilderModule {
    @Binds
    ServiceComponentBuilder bind(ServiceC.Builder builder);
  }

  @Module(
      subcomponents = ActivityRetainedC.class
  )
  @DisableInstallInCheck
  abstract interface ActivityRetainedCBuilderModule {
    @Binds
    ActivityRetainedComponentBuilder bind(ActivityRetainedC.Builder builder);
  }

  @Module(
      subcomponents = ActivityC.class
  )
  @DisableInstallInCheck
  abstract interface ActivityCBuilderModule {
    @Binds
    ActivityComponentBuilder bind(ActivityC.Builder builder);
  }

  @Module(
      subcomponents = ViewModelC.class
  )
  @DisableInstallInCheck
  abstract interface ViewModelCBuilderModule {
    @Binds
    ViewModelComponentBuilder bind(ViewModelC.Builder builder);
  }

  @Module(
      subcomponents = ViewC.class
  )
  @DisableInstallInCheck
  abstract interface ViewCBuilderModule {
    @Binds
    ViewComponentBuilder bind(ViewC.Builder builder);
  }

  @Module(
      subcomponents = FragmentC.class
  )
  @DisableInstallInCheck
  abstract interface FragmentCBuilderModule {
    @Binds
    FragmentComponentBuilder bind(FragmentC.Builder builder);
  }

  @Module(
      subcomponents = ViewWithFragmentC.class
  )
  @DisableInstallInCheck
  abstract interface ViewWithFragmentCBuilderModule {
    @Binds
    ViewWithFragmentComponentBuilder bind(ViewWithFragmentC.Builder builder);
  }

  @Component(
      modules = {
          ApplicationContextModule.class,
          ActivityRetainedCBuilderModule.class,
          ServiceCBuilderModule.class,
          NetworkModule.class
      }
  )
  @Singleton
  public abstract static class SingletonC implements HungryApp_GeneratedInjector,
      HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint,
      ServiceComponentManager.ServiceComponentBuilderEntryPoint,
      SingletonComponent,
      GeneratedComponent {
  }

  @Subcomponent
  @ServiceScoped
  public abstract static class ServiceC implements ServiceComponent,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ServiceComponentBuilder {
    }
  }

  @Subcomponent(
      modules = {
          AddAddressViewModel_HiltModules.KeyModule.class,
          AddRestaurantViewModel_HiltModules.KeyModule.class,
          AddressListViewModel_HiltModules.KeyModule.class,
          ChangePasswordViewModel_HiltModules.KeyModule.class,
          DatabaseModule.class,
          EditProfileViewModel_HiltModules.KeyModule.class,
          HiltWrapper_ActivityRetainedComponentManager_LifecycleModule.class,
          HomeFragmentViewModel_HiltModules.KeyModule.class,
          ActivityCBuilderModule.class,
          ViewModelCBuilderModule.class,
          LoginViewModel_HiltModules.KeyModule.class,
          MealAddingViewModel_HiltModules.KeyModule.class,
          MealDetailViewModel_HiltModules.KeyModule.class,
          OrderHistoryViewModel_HiltModules.KeyModule.class,
          ProfileViewModel_HiltModules.KeyModule.class,
          RegisterViewModel_HiltModules.KeyModule.class,
          RestaurantDetailViewModel_HiltModules.KeyModule.class,
          SplashViewModel_HiltModules.KeyModule.class
      }
  )
  @ActivityRetainedScoped
  public abstract static class ActivityRetainedC implements ActivityRetainedComponent,
      ActivityComponentManager.ActivityComponentBuilderEntryPoint,
      HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ActivityRetainedComponentBuilder {
    }
  }

  @Subcomponent(
      modules = {
          HiltWrapper_ActivityModule.class,
          HiltWrapper_DefaultViewModelFactories_ActivityModule.class,
          FragmentCBuilderModule.class,
          ViewCBuilderModule.class
      }
  )
  @ActivityScoped
  public abstract static class ActivityC implements MainActivity_GeneratedInjector,
      ActivityComponent,
      DefaultViewModelFactories.ActivityEntryPoint,
      HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint,
      FragmentComponentManager.FragmentComponentBuilderEntryPoint,
      ViewComponentManager.ViewComponentBuilderEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ActivityComponentBuilder {
    }
  }

  @Subcomponent(
      modules = {
          AddAddressViewModel_HiltModules.BindsModule.class,
          AddRestaurantViewModel_HiltModules.BindsModule.class,
          AddressListViewModel_HiltModules.BindsModule.class,
          ChangePasswordViewModel_HiltModules.BindsModule.class,
          EditProfileViewModel_HiltModules.BindsModule.class,
          HiltWrapper_HiltViewModelFactory_ViewModelModule.class,
          HomeFragmentViewModel_HiltModules.BindsModule.class,
          LoginViewModel_HiltModules.BindsModule.class,
          MealAddingViewModel_HiltModules.BindsModule.class,
          MealDetailViewModel_HiltModules.BindsModule.class,
          OrderHistoryViewModel_HiltModules.BindsModule.class,
          ProfileViewModel_HiltModules.BindsModule.class,
          RegisterViewModel_HiltModules.BindsModule.class,
          RestaurantDetailViewModel_HiltModules.BindsModule.class,
          SplashViewModel_HiltModules.BindsModule.class
      }
  )
  @ViewModelScoped
  public abstract static class ViewModelC implements ViewModelComponent,
      HiltViewModelFactory.ViewModelFactoriesEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ViewModelComponentBuilder {
    }
  }

  @Subcomponent
  @ViewScoped
  public abstract static class ViewC implements ViewComponent,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ViewComponentBuilder {
    }
  }

  @Subcomponent(
      modules = ViewWithFragmentCBuilderModule.class
  )
  @FragmentScoped
  public abstract static class FragmentC implements AddAddressFragment_GeneratedInjector,
      AddRestaurantFragment_GeneratedInjector,
      AddressListFragment_GeneratedInjector,
      ChangePasswordFragment_GeneratedInjector,
      EditProfileFragment_GeneratedInjector,
      HomeFragment_GeneratedInjector,
      LoginFragment_GeneratedInjector,
      MealAddingFragment_GeneratedInjector,
      MealDetailFragment_GeneratedInjector,
      MainOnBoardingFragment_GeneratedInjector,
      OrderHistoryFragment_GeneratedInjector,
      ProfileFragment_GeneratedInjector,
      RegisterFragment_GeneratedInjector,
      RestaurantDetailFragment_GeneratedInjector,
      SplashFragment_GeneratedInjector,
      FragmentComponent,
      DefaultViewModelFactories.FragmentEntryPoint,
      ViewComponentManager.ViewWithFragmentComponentBuilderEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends FragmentComponentBuilder {
    }
  }

  @Subcomponent
  @ViewScoped
  public abstract static class ViewWithFragmentC implements ViewWithFragmentComponent,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ViewWithFragmentComponentBuilder {
    }
  }
}
