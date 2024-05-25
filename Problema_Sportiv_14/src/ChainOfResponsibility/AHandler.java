package ChainOfResponsibility;

public abstract class AHandler {
    private AHandler nextHandler;

    public AHandler getNextHandler(){
        return this.nextHandler;
    }

    public void setNextHandler(AHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    abstract void executaPas(Spectator spectator);
}
