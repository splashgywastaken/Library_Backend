package ru.libraryteam.library.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.immutables.value.Generated;
import org.springframework.lang.Nullable;
import ru.libraryteam.library.commons.Role;

/**
 * Immutable implementation of {@link UserDto}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableUserDto.builder()}.
 */
@Generated(from = "UserDto", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutableUserDto implements UserDto {
  private final Integer id;
  private final @Nullable String username;
  private final @Nullable String firstName;
  private final @Nullable String lastName;
  private final @Nullable String middleName;
  private final @Nullable Date birthday;
  private final @Nullable String sex;
  private final @Nullable String email;
  private final Role role;

  private ImmutableUserDto(
      Integer id,
      @Nullable String username,
      @Nullable String firstName,
      @Nullable String lastName,
      @Nullable String middleName,
      @Nullable Date birthday,
      @Nullable String sex,
      @Nullable String email,
      Role role) {
    this.id = id;
    this.username = username;
    this.firstName = firstName;
    this.lastName = lastName;
    this.middleName = middleName;
    this.birthday = birthday;
    this.sex = sex;
    this.email = email;
    this.role = role;
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Integer getId() {
    return id;
  }

  /**
   * @return The value of the {@code username} attribute
   */
  @JsonProperty("username")
  @Override
  public @Nullable String getUsername() {
    return username;
  }

  /**
   * @return The value of the {@code firstName} attribute
   */
  @JsonProperty("first_name")
  @Override
  public @Nullable String getFirstName() {
    return firstName;
  }

  /**
   * @return The value of the {@code lastName} attribute
   */
  @JsonProperty("last_name")
  @Override
  public @Nullable String getLastName() {
    return lastName;
  }

  /**
   * @return The value of the {@code middleName} attribute
   */
  @JsonProperty("middle_name")
  @Override
  public @Nullable String getMiddleName() {
    return middleName;
  }

  /**
   * @return The value of the {@code birthday} attribute
   */
  @JsonProperty("birthday")
  @Override
  public @Nullable Date getBirthday() {
    return birthday;
  }

  /**
   * @return The value of the {@code sex} attribute
   */
  @JsonProperty("sex")
  @Override
  public @Nullable String getSex() {
    return sex;
  }

  /**
   * @return The value of the {@code email} attribute
   */
  @JsonProperty("email")
  @Override
  public @Nullable String getEmail() {
    return email;
  }

  /**
   * @return The value of the {@code role} attribute
   */
  @JsonProperty("role")
  @Override
  public Role getRole() {
    return role;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link UserDto#getId() id} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for id
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableUserDto withId(Integer value) {
    Integer newValue = Objects.requireNonNull(value, "id");
    if (this.id.equals(newValue)) return this;
    return new ImmutableUserDto(
        newValue,
        this.username,
        this.firstName,
        this.lastName,
        this.middleName,
        this.birthday,
        this.sex,
        this.email,
        this.role);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link UserDto#getUsername() username} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for username (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableUserDto withUsername(@Nullable String value) {
    if (Objects.equals(this.username, value)) return this;
    return new ImmutableUserDto(
        this.id,
        value,
        this.firstName,
        this.lastName,
        this.middleName,
        this.birthday,
        this.sex,
        this.email,
        this.role);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link UserDto#getFirstName() firstName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for firstName (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableUserDto withFirstName(@Nullable String value) {
    if (Objects.equals(this.firstName, value)) return this;
    return new ImmutableUserDto(
        this.id,
        this.username,
        value,
        this.lastName,
        this.middleName,
        this.birthday,
        this.sex,
        this.email,
        this.role);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link UserDto#getLastName() lastName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastName (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableUserDto withLastName(@Nullable String value) {
    if (Objects.equals(this.lastName, value)) return this;
    return new ImmutableUserDto(
        this.id,
        this.username,
        this.firstName,
        value,
        this.middleName,
        this.birthday,
        this.sex,
        this.email,
        this.role);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link UserDto#getMiddleName() middleName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for middleName (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableUserDto withMiddleName(@Nullable String value) {
    if (Objects.equals(this.middleName, value)) return this;
    return new ImmutableUserDto(
        this.id,
        this.username,
        this.firstName,
        this.lastName,
        value,
        this.birthday,
        this.sex,
        this.email,
        this.role);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link UserDto#getBirthday() birthday} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for birthday (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableUserDto withBirthday(@Nullable Date value) {
    if (this.birthday == value) return this;
    return new ImmutableUserDto(
        this.id,
        this.username,
        this.firstName,
        this.lastName,
        this.middleName,
        value,
        this.sex,
        this.email,
        this.role);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link UserDto#getSex() sex} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for sex (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableUserDto withSex(@Nullable String value) {
    if (Objects.equals(this.sex, value)) return this;
    return new ImmutableUserDto(
        this.id,
        this.username,
        this.firstName,
        this.lastName,
        this.middleName,
        this.birthday,
        value,
        this.email,
        this.role);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link UserDto#getEmail() email} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for email (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableUserDto withEmail(@Nullable String value) {
    if (Objects.equals(this.email, value)) return this;
    return new ImmutableUserDto(
        this.id,
        this.username,
        this.firstName,
        this.lastName,
        this.middleName,
        this.birthday,
        this.sex,
        value,
        this.role);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link UserDto#getRole() role} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for role
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableUserDto withRole(Role value) {
    if (this.role == value) return this;
    Role newValue = Objects.requireNonNull(value, "role");
    if (this.role.equals(newValue)) return this;
    return new ImmutableUserDto(
        this.id,
        this.username,
        this.firstName,
        this.lastName,
        this.middleName,
        this.birthday,
        this.sex,
        this.email,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableUserDto} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableUserDto
        && equalTo((ImmutableUserDto) another);
  }

  private boolean equalTo(ImmutableUserDto another) {
    return id.equals(another.id)
        && Objects.equals(username, another.username)
        && Objects.equals(firstName, another.firstName)
        && Objects.equals(lastName, another.lastName)
        && Objects.equals(middleName, another.middleName)
        && Objects.equals(birthday, another.birthday)
        && Objects.equals(sex, another.sex)
        && Objects.equals(email, another.email)
        && role.equals(another.role);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code username}, {@code firstName}, {@code lastName}, {@code middleName}, {@code birthday}, {@code sex}, {@code email}, {@code role}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + id.hashCode();
    h += (h << 5) + Objects.hashCode(username);
    h += (h << 5) + Objects.hashCode(firstName);
    h += (h << 5) + Objects.hashCode(lastName);
    h += (h << 5) + Objects.hashCode(middleName);
    h += (h << 5) + Objects.hashCode(birthday);
    h += (h << 5) + Objects.hashCode(sex);
    h += (h << 5) + Objects.hashCode(email);
    h += (h << 5) + role.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code UserDto} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "UserDto{"
        + "id=" + id
        + ", username=" + username
        + ", firstName=" + firstName
        + ", lastName=" + lastName
        + ", middleName=" + middleName
        + ", birthday=" + birthday
        + ", sex=" + sex
        + ", email=" + email
        + ", role=" + role
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link UserDto} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable UserDto instance
   */
  public static ImmutableUserDto copyOf(UserDto instance) {
    if (instance instanceof ImmutableUserDto) {
      return (ImmutableUserDto) instance;
    }
    return ImmutableUserDto.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableUserDto ImmutableUserDto}.
   * <pre>
   * ImmutableUserDto.builder()
   *    .id(Integer) // required {@link UserDto#getId() id}
   *    .username(String | null) // nullable {@link UserDto#getUsername() username}
   *    .firstName(String | null) // nullable {@link UserDto#getFirstName() firstName}
   *    .lastName(String | null) // nullable {@link UserDto#getLastName() lastName}
   *    .middleName(String | null) // nullable {@link UserDto#getMiddleName() middleName}
   *    .birthday(java.sql.Date | null) // nullable {@link UserDto#getBirthday() birthday}
   *    .sex(String | null) // nullable {@link UserDto#getSex() sex}
   *    .email(String | null) // nullable {@link UserDto#getEmail() email}
   *    .role(ru.libraryteam.library.commons.Role) // required {@link UserDto#getRole() role}
   *    .build();
   * </pre>
   * @return A new ImmutableUserDto builder
   */
  public static ImmutableUserDto.Builder builder() {
    return new ImmutableUserDto.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableUserDto ImmutableUserDto}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "UserDto", generator = "Immutables")
  @JsonPropertyOrder({"id", "first_name", "last_name", "middle_name", "birthday", "sex", "username", "email", "role"})
  public static final class Builder {
    private static final long INIT_BIT_ID = 0x1L;
    private static final long INIT_BIT_ROLE = 0x2L;
    private long initBits = 0x3L;

    private Integer id;
    private String username;
    private String firstName;
    private String lastName;
    private String middleName;
    private Date birthday;
    private String sex;
    private String email;
    private Role role;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code UserDto} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(UserDto instance) {
      Objects.requireNonNull(instance, "instance");
      id(instance.getId());
      String usernameValue = instance.getUsername();
      if (usernameValue != null) {
        username(usernameValue);
      }
      String firstNameValue = instance.getFirstName();
      if (firstNameValue != null) {
        firstName(firstNameValue);
      }
      String lastNameValue = instance.getLastName();
      if (lastNameValue != null) {
        lastName(lastNameValue);
      }
      String middleNameValue = instance.getMiddleName();
      if (middleNameValue != null) {
        middleName(middleNameValue);
      }
      Date birthdayValue = instance.getBirthday();
      if (birthdayValue != null) {
        birthday(birthdayValue);
      }
      String sexValue = instance.getSex();
      if (sexValue != null) {
        sex(sexValue);
      }
      String emailValue = instance.getEmail();
      if (emailValue != null) {
        email(emailValue);
      }
      role(instance.getRole());
      return this;
    }

    /**
     * Initializes the value for the {@link UserDto#getId() id} attribute.
     * @param id The value for id 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Integer id) {
      this.id = Objects.requireNonNull(id, "id");
      initBits &= ~INIT_BIT_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link UserDto#getUsername() username} attribute.
     * @param username The value for username (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("username")
    public final Builder username(@Nullable String username) {
      this.username = username;
      return this;
    }

    /**
     * Initializes the value for the {@link UserDto#getFirstName() firstName} attribute.
     * @param firstName The value for firstName (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("first_name")
    public final Builder firstName(@Nullable String firstName) {
      this.firstName = firstName;
      return this;
    }

    /**
     * Initializes the value for the {@link UserDto#getLastName() lastName} attribute.
     * @param lastName The value for lastName (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("last_name")
    public final Builder lastName(@Nullable String lastName) {
      this.lastName = lastName;
      return this;
    }

    /**
     * Initializes the value for the {@link UserDto#getMiddleName() middleName} attribute.
     * @param middleName The value for middleName (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("middle_name")
    public final Builder middleName(@Nullable String middleName) {
      this.middleName = middleName;
      return this;
    }

    /**
     * Initializes the value for the {@link UserDto#getBirthday() birthday} attribute.
     * @param birthday The value for birthday (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("birthday")
    public final Builder birthday(@Nullable Date birthday) {
      this.birthday = birthday;
      return this;
    }

    /**
     * Initializes the value for the {@link UserDto#getSex() sex} attribute.
     * @param sex The value for sex (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("sex")
    public final Builder sex(@Nullable String sex) {
      this.sex = sex;
      return this;
    }

    /**
     * Initializes the value for the {@link UserDto#getEmail() email} attribute.
     * @param email The value for email (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("email")
    public final Builder email(@Nullable String email) {
      this.email = email;
      return this;
    }

    /**
     * Initializes the value for the {@link UserDto#getRole() role} attribute.
     * @param role The value for role 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("role")
    public final Builder role(Role role) {
      this.role = Objects.requireNonNull(role, "role");
      initBits &= ~INIT_BIT_ROLE;
      return this;
    }

    /**
     * Builds a new {@link ImmutableUserDto ImmutableUserDto}.
     * @return An immutable instance of UserDto
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableUserDto build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableUserDto(id, username, firstName, lastName, middleName, birthday, sex, email, role);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_ID) != 0) attributes.add("id");
      if ((initBits & INIT_BIT_ROLE) != 0) attributes.add("role");
      return "Cannot build UserDto, some of required attributes are not set " + attributes;
    }
  }
}
