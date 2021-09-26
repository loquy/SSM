package com.pojo;

import lombok.*;

/**
 * @EqualsAndHashCode
 * @AllArgsConstructor, @RequiredArgsConstructor and @NoArgsConstructor
 * @Log, @Log4j, @Log4j2, @Slf4j, @XSlf4j, @CommonsLog, @JBossLog, @Flogger, @CustomLog
 * @Data
 * @Builder
 * @SuperBuilder
 * @Singular
 * @Delegate
 * @Value
 * @Accessors
 * @Wither
 * @With
 * @SneakyThrows
 * @val
 * @var
 * experimental @var
 * @UtilityClass
 * Lombok config system
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class User {
    private int id;
    private String name;
    private String password;

//    public User() {
//    }
//
//    public User(int id, String name, String password) {
//        this.id = id;
//        this.name = name;
//        this.password = password;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", password='" + password + '\'' +
//                '}';
//    }
}
