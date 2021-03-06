package main.module;

import main.command.Command;
import main.command.HelloWorldCommand;
import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;

@Module
public abstract class HelloWorldModule {

    @Binds
    @IntoMap
    @StringKey("hello")
    abstract Command helloWorldCommand(HelloWorldCommand command);
}
