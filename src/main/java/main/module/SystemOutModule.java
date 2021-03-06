package main.module;

import main.command.Outputter;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class SystemOutModule {

    @Provides
    static Outputter textOutputter() {
        return System.out::println;
    }
}
