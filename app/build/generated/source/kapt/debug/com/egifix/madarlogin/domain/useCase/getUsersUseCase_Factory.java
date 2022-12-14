// Generated by Dagger (https://dagger.dev).
package com.egifix.madarlogin.domain.useCase;

import com.egifix.madarlogin.data.repo.ApiUserHelper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class getUsersUseCase_Factory implements Factory<getUsersUseCase> {
  private final Provider<ApiUserHelper> apiHelperProvider;

  public getUsersUseCase_Factory(Provider<ApiUserHelper> apiHelperProvider) {
    this.apiHelperProvider = apiHelperProvider;
  }

  @Override
  public getUsersUseCase get() {
    return newInstance(apiHelperProvider.get());
  }

  public static getUsersUseCase_Factory create(Provider<ApiUserHelper> apiHelperProvider) {
    return new getUsersUseCase_Factory(apiHelperProvider);
  }

  public static getUsersUseCase newInstance(ApiUserHelper apiHelper) {
    return new getUsersUseCase(apiHelper);
  }
}
