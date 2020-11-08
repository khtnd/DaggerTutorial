package main.module;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;
import main.command.Command;
import main.command.DepositCommand;

@Module
public abstract class UserCommandsModule {

    @Binds
    @IntoMap
    @StringKey("deposit")
    public abstract Command depositCommand(DepositCommand command);
}
