package main;

import dagger.Component;
import main.module.HelloWorldModule;
import main.module.LoginCommandModule;
import main.module.SystemOutModule;
import main.module.UserCommandsModule;

import javax.inject.Singleton;

@Singleton
@Component(modules = {SystemOutModule.class, LoginCommandModule.class, HelloWorldModule.class
                        , UserCommandsModule.class})
public interface CommandRouterFactory {
    CommandRouter router();
}
