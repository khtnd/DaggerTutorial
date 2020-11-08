import dagger.Component;

@Component(modules = {SystemOutModule.class, LoginCommandModule.class})
public interface CommandRouterFactory {
    CommandRouter router();
}
