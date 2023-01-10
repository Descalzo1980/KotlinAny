package moskala.classes;

import org.jetbrains.annotations.NotNull;

public final class UserName {
    @NotNull
    private final String name;
    @NotNull
    private final String surname;
    private final int age;
    public UserName(
            @NotNull String name,
            @NotNull String surname,
            int age
    ) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    @NotNull
    public String getName() {
        return name;
    }
    @NotNull
    public String getSurname() {
        return surname;
    }
    public int getAge() {
        return age;
    }
}
