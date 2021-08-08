package ru.libraryteam.library.service.security;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.immutables.value.Generated;
import ru.libraryteam.library.commons.Role;

/**
 * Immutable implementation of {@link Profile}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableProfile.builder()}.
 */
@Generated(from = "Profile", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutableProfile implements Profile {
  private final int id;
  private final String firstName;
  private final String lastName;
  private final String middleName;
  private final String sex;
  private final String email;
  private final String username;
  private final String password;
  private final Role role;

  private ImmutableProfile(
      int id,
      String firstName,
      String lastName,
      String middleName,
      String sex,
      String email,
      String username,
      String password,
      Role role) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.middleName = middleName;
    this.sex = sex;
    this.email = email;
    this.username = username;
    this.password = password;
    this.role = role;
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @Override
  public int getId() {
    return id;
  }

  /**
   * @return The value of the {@code firstName} attribute
   */
  @Override
  public String getFirstName() {
    return firstName;
  }

  /**
   * @return The value of the {@code lastName} attribute
   */
  @Override
  public String getLastName() {
    return lastName;
  }

  /**
   * @return The value of the {@code middleName} attribute
   */
  @Override
  public String getMiddleName() {
    return middleName;
  }

  /**
   * @return The value of the {@code sex} attribute
   */
  @Override
  public String getSex() {
    return sex;
  }

  /**
   * @return The value of the {@code email} attribute
   */
  @Override
  public String getEmail() {
    return email;
  }

  /**
   * @return The value of the {@code username} attribute
   */
  @Override
  public String getUsername() {
    return username;
  }

  /**
   * @return The value of the {@code password} attribute
   */
  @Override
  public String getPassword() {
    return password;
  }

  /**
   * @return The value of the {@code role} attribute
   */
  @Override
  public Role getRole() {
    return role;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Profile#getId() id} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for id
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableProfile withId(int value) {
    if (this.id == value) return this;
    return new ImmutableProfile(
        value,
        this.firstName,
        this.lastName,
        this.middleName,
        this.sex,
        this.email,
        this.username,
        this.password,
        this.role);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Profile#getFirstName() firstName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for firstName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableProfile withFirstName(String value) {
    String newValue = Objects.requireNonNull(value, "firstName");
    if (this.firstName.equals(newValue)) return this;
    return new ImmutableProfile(
        this.id,
        newValue,
        this.lastName,
        this.middleName,
        this.sex,
        this.email,
        this.username,
        this.password,
        this.role);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Profile#getLastName() lastName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableProfile withLastName(String value) {
    String newValue = Objects.requireNonNull(value, "lastName");
    if (this.lastName.equals(newValue)) return this;
    return new ImmutableProfile(
        this.id,
        this.firstName,
        newValue,
        this.middleName,
        this.sex,
        this.email,
        this.username,
        this.password,
        this.role);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Profile#getMiddleName() middleName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for middleName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableProfile withMiddleName(String value) {
    String newValue = Objects.requireNonNull(value, "middleName");
    if (this.middleName.equals(newValue)) return this;
    return new ImmutableProfile(
        this.id,
        this.firstName,
        this.lastName,
        newValue,
        this.sex,
        this.email,
        this.username,
        this.password,
        this.role);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Profile#getSex() sex} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for sex
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableProfile withSex(String value) {
    String newValue = Objects.requireNonNull(value, "sex");
    if (this.sex.equals(newValue)) return this;
    return new ImmutableProfile(
        this.id,
        this.firstName,
        this.lastName,
        this.middleName,
        newValue,
        this.email,
        this.username,
        this.password,
        this.role);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Profile#getEmail() email} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for email
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableProfile withEmail(String value) {
    String newValue = Objects.requireNonNull(value, "email");
    if (this.email.equals(newValue)) return this;
    return new ImmutableProfile(
        this.id,
        this.firstName,
        this.lastName,
        this.middleName,
        this.sex,
        newValue,
        this.username,
        this.password,
        this.role);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Profile#getUsername() username} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for username
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableProfile withUsername(String value) {
    String newValue = Objects.requireNonNull(value, "username");
    if (this.username.equals(newValue)) return this;
    return new ImmutableProfile(
        this.id,
        this.firstName,
        this.lastName,
        this.middleName,
        this.sex,
        this.email,
        newValue,
        this.password,
        this.role);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Profile#getPassword() password} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for password
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableProfile withPassword(String value) {
    String newValue = Objects.requireNonNull(value, "password");
    if (this.password.equals(newValue)) return this;
    return new ImmutableProfile(
        this.id,
        this.firstName,
        this.lastName,
        this.middleName,
        this.sex,
        this.email,
        this.username,
        newValue,
        this.role);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Profile#getRole() role} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for role
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableProfile withRole(Role value) {
    if (this.role == value) return this;
    Role newValue = Objects.requireNonNull(value, "role");
    if (this.role.equals(newValue)) return this;
    return new ImmutableProfile(
        this.id,
        this.firstName,
        this.lastName,
        this.middleName,
        this.sex,
        this.email,
        this.username,
        this.password,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableProfile} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableProfile
        && equalTo((ImmutableProfile) another);
  }

  private boolean equalTo(ImmutableProfile another) {
    return id == another.id
        && firstName.equals(another.firstName)
        && lastName.equals(another.lastName)
        && middleName.equals(another.middleName)
        && sex.equals(another.sex)
        && email.equals(another.email)
        && username.equals(another.username)
        && password.equals(another.password)
        && role.equals(another.role);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code firstName}, {@code lastName}, {@code middleName}, {@code sex}, {@code email}, {@code username}, {@code password}, {@code role}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + id;
    h += (h << 5) + firstName.hashCode();
    h += (h << 5) + lastName.hashCode();
    h += (h << 5) + middleName.hashCode();
    h += (h << 5) + sex.hashCode();
    h += (h << 5) + email.hashCode();
    h += (h << 5) + username.hashCode();
    h += (h << 5) + password.hashCode();
    h += (h << 5) + role.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Profile} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "Profile{"
        + "id=" + id
        + ", firstName=" + firstName
        + ", lastName=" + lastName
        + ", middleName=" + middleName
        + ", sex=" + sex
        + ", email=" + email
        + ", username=" + username
        + ", password=" + password
        + ", role=" + role
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link Profile} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Profile instance
   */
  public static ImmutableProfile copyOf(Profile instance) {
    if (instance instanceof ImmutableProfile) {
      return (ImmutableProfile) instance;
    }
    return ImmutableProfile.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableProfile ImmutableProfile}.
   * <pre>
   * ImmutableProfile.builder()
   *    .id(int) // required {@link Profile#getId() id}
   *    .firstName(String) // required {@link Profile#getFirstName() firstName}
   *    .lastName(String) // required {@link Profile#getLastName() lastName}
   *    .middleName(String) // required {@link Profile#getMiddleName() middleName}
   *    .sex(String) // required {@link Profile#getSex() sex}
   *    .email(String) // required {@link Profile#getEmail() email}
   *    .username(String) // required {@link Profile#getUsername() username}
   *    .password(String) // required {@link Profile#getPassword() password}
   *    .role(ru.libraryteam.library.commons.Role) // required {@link Profile#getRole() role}
   *    .build();
   * </pre>
   * @return A new ImmutableProfile builder
   */
  public static ImmutableProfile.Builder builder() {
    return new ImmutableProfile.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableProfile ImmutableProfile}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Profile", generator = "Immutables")
  public static final class Builder {
    private static final long INIT_BIT_ID = 0x1L;
    private static final long INIT_BIT_FIRST_NAME = 0x2L;
    private static final long INIT_BIT_LAST_NAME = 0x4L;
    private static final long INIT_BIT_MIDDLE_NAME = 0x8L;
    private static final long INIT_BIT_SEX = 0x10L;
    private static final long INIT_BIT_EMAIL = 0x20L;
    private static final long INIT_BIT_USERNAME = 0x40L;
    private static final long INIT_BIT_PASSWORD = 0x80L;
    private static final long INIT_BIT_ROLE = 0x100L;
    private long initBits = 0x1ffL;

    private int id;
    private String firstName;
    private String lastName;
    private String middleName;
    private String sex;
    private String email;
    private String username;
    private String password;
    private Role role;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Profile} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Profile instance) {
      Objects.requireNonNull(instance, "instance");
      id(instance.getId());
      firstName(instance.getFirstName());
      lastName(instance.getLastName());
      middleName(instance.getMiddleName());
      sex(instance.getSex());
      email(instance.getEmail());
      username(instance.getUsername());
      password(instance.getPassword());
      role(instance.getRole());
      return this;
    }

    /**
     * Initializes the value for the {@link Profile#getId() id} attribute.
     * @param id The value for id 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder id(int id) {
      this.id = id;
      initBits &= ~INIT_BIT_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link Profile#getFirstName() firstName} attribute.
     * @param firstName The value for firstName 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder firstName(String firstName) {
      this.firstName = Objects.requireNonNull(firstName, "firstName");
      initBits &= ~INIT_BIT_FIRST_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link Profile#getLastName() lastName} attribute.
     * @param lastName The value for lastName 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder lastName(String lastName) {
      this.lastName = Objects.requireNonNull(lastName, "lastName");
      initBits &= ~INIT_BIT_LAST_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link Profile#getMiddleName() middleName} attribute.
     * @param middleName The value for middleName 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder middleName(String middleName) {
      this.middleName = Objects.requireNonNull(middleName, "middleName");
      initBits &= ~INIT_BIT_MIDDLE_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link Profile#getSex() sex} attribute.
     * @param sex The value for sex 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder sex(String sex) {
      this.sex = Objects.requireNonNull(sex, "sex");
      initBits &= ~INIT_BIT_SEX;
      return this;
    }

    /**
     * Initializes the value for the {@link Profile#getEmail() email} attribute.
     * @param email The value for email 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder email(String email) {
      this.email = Objects.requireNonNull(email, "email");
      initBits &= ~INIT_BIT_EMAIL;
      return this;
    }

    /**
     * Initializes the value for the {@link Profile#getUsername() username} attribute.
     * @param username The value for username 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder username(String username) {
      this.username = Objects.requireNonNull(username, "username");
      initBits &= ~INIT_BIT_USERNAME;
      return this;
    }

    /**
     * Initializes the value for the {@link Profile#getPassword() password} attribute.
     * @param password The value for password 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder password(String password) {
      this.password = Objects.requireNonNull(password, "password");
      initBits &= ~INIT_BIT_PASSWORD;
      return this;
    }

    /**
     * Initializes the value for the {@link Profile#getRole() role} attribute.
     * @param role The value for role 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder role(Role role) {
      this.role = Objects.requireNonNull(role, "role");
      initBits &= ~INIT_BIT_ROLE;
      return this;
    }

    /**
     * Builds a new {@link ImmutableProfile ImmutableProfile}.
     * @return An immutable instance of Profile
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableProfile build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableProfile(id, firstName, lastName, middleName, sex, email, username, password, role);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_ID) != 0) attributes.add("id");
      if ((initBits & INIT_BIT_FIRST_NAME) != 0) attributes.add("firstName");
      if ((initBits & INIT_BIT_LAST_NAME) != 0) attributes.add("lastName");
      if ((initBits & INIT_BIT_MIDDLE_NAME) != 0) attributes.add("middleName");
      if ((initBits & INIT_BIT_SEX) != 0) attributes.add("sex");
      if ((initBits & INIT_BIT_EMAIL) != 0) attributes.add("email");
      if ((initBits & INIT_BIT_USERNAME) != 0) attributes.add("username");
      if ((initBits & INIT_BIT_PASSWORD) != 0) attributes.add("password");
      if ((initBits & INIT_BIT_ROLE) != 0) attributes.add("role");
      return "Cannot build Profile, some of required attributes are not set " + attributes;
    }
  }
}
