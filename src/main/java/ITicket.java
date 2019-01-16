public interface ITicket {
    public double defaultPrice();

    public double priceFor(Visitor visitor);
}
