package equity.bk;


/**
 * Simple thread-safe account model for opening and operating an account.
 */
public final class OpenAccount {
    private static final AtomicLong ID_GENERATOR = new AtomicLong(1000);

    private final long accountId;
    private final String owner;
    private BigDecimal balance;

    public OpenAccount(String owner) {
        this(owner, BigDecimal.ZERO);
    }

    public OpenAccount(String owner, BigDecimal initialBalance) {
        this.owner = Objects.requireNonNull(owner, "owner must not be null").trim();
        if (this.owner.isEmpty()) throw new IllegalArgumentException("owner must not be empty");
        this.accountId = ID_GENERATOR.getAndIncrement();
        this.balance = (initialBalance == null) ? BigDecimal.ZERO : initialBalance.max(BigDecimal.ZERO);
    }

    public long getAccountId() {
        return accountId;
    }

    public String getOwner() {
        return owner;
    }

    public synchronized BigDecimal getBalance() {
        return balance;
    }

    /**
     * Deposit a positive amount. Returns the new balance.
     */
    public synchronized BigDecimal deposit(BigDecimal amount) {
        validatePositive(amount, "deposit");
        balance = balance.add(amount);
        return balance;
    }

    /**
     * Withdraw a positive amount. Throws InsufficientFundsException if balance is insufficient.
     * Returns the new balance.
     */
    public synchronized BigDecimal withdraw(BigDecimal amount) throws InsufficientFundsException {
        validatePositive(amount, "withdraw");
        if (balance.compareTo(amount) < 0) throw new InsufficientFundsException("Insufficient funds");
        balance = balance.subtract(amount);
        return balance;
    }

    private static void validatePositive(BigDecimal amount, String operation) {
        if (amount == null) throw new IllegalArgumentException(operation + " amount must not be null");
        if (amount.compareTo(BigDecimal.ZERO) <= 0) throw new IllegalArgumentException(operation + " amount must be positive");
    }

    @Override
    public String toString() {
        return "OpenAccount{" +
                "accountId=" + accountId +
                ", owner='" + owner + '\'' +
                ", balance=" + balance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OpenAccount that = (OpenAccount) o;

        return accountId == that.accountId;
    }

    @Override
    public int hashCode() {
        return Long.hashCode(accountId);
    }

    public static class InsufficientFundsException extends Exception {
        public InsufficientFundsException(String message) {
            super(message);
        }
    }
}