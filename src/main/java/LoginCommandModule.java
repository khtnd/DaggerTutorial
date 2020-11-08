import command.Command;
import command.LoginCommand;
import dagger.Binds;
import dagger.Module;

@Module
public abstract class LoginCommandModule {

    @Binds
    abstract Command loginCommand(LoginCommand command);
}
