package org.example.exercises.filterbalance;

import java.util.List;

public class AccountApplication {

    public static void main(String[] args) {
        List<User> users = createUsersAndAccounts();

        List<User> usersWithMoreThan120 = users.stream()
                .filter((u) -> u.getAccount().getAmount() > 120)
                .toList();

        usersWithMoreThan120.forEach((user) -> {
                System.out.println(user.getName());
            }
        );

        int numberOfUsersWithMoreThan120 = (int) users.stream()
                .filter((u) -> u.getAccount().getAmount() > 120)
                .count();

        List<User> usersWithAmountUpdated = users.stream()
                .filter((u) -> u.getAccount().getAmount() > 120)
                .peek((user -> {
                    double amount = user.getAccount().getAmount();
                    user.getAccount().setAmount(amount + (amount * 0.10));

                }))
                .toList();

        usersWithAmountUpdated.stream().peek((user -> System.out.println(user.getAccount().getAmount())));
    }

    public static List<User> createUsersAndAccounts() {
        Account firstAccount = new Account(1, 150.0);
        Account secondAccount = new Account(2, 100.0);
        Account thirdAccount = new Account(3, 30.0);

        User firstUser = new User("first", firstAccount);
        User secondUser = new User("second",secondAccount);
        User thirdUser = new User("third", thirdAccount);

        return List.of(firstUser, secondUser, thirdUser);
    }
}
