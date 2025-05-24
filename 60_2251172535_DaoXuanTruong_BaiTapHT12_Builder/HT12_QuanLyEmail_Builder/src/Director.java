public class Director {
    private IEmailNotifierBuilder builder;

    public Director(IEmailNotifierBuilder builder) {
        this.builder = builder;
    }

    public void changeBuilder(IEmailNotifierBuilder builder) {
        this.builder = builder;
    }

    public void make() {
        builder.reset();
        builder.buildEmailService(); 
    }
}
