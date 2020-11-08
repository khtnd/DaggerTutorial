package main;

import dagger.Component;

@Component(modules = {SystemOutModule.class, LoginCommandModule.class, HelloWorldModule.class})
public interface CommandRouterFactory {
    CommandRouter router();
}
