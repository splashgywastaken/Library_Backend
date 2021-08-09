package ru.libraryteam.library.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.immutables.value.Generated;
import org.springframework.lang.Nullable;

/**
 * Immutable implementation of {@link AuthorDto}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAuthorDto.builder()}.
 */
@Generated(from = "AuthorDto", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutableAuthorDto implements AuthorDto {
  private final @Nullable Integer id;
  private final String firstName;
  private final String lastName;

  private ImmutableAuthorDto(
      @Nullable Integer id,
      String firstName,
      String lastName) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public @Nullable Integer getId() {
    return id;
  }

  /**
   * @return The value of the {@code firstName} attribute
   */
  @JsonProperty("first_name")
  @Override
  public String getFirstName() {
    return firstName;
  }

  /**
   * @return The value of the {@code lastName} attribute
   */
  @JsonProperty("last_name")
  @Override
  public String getLastName() {
    return lastName;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AuthorDto#getId() id} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for id (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAuthorDto withId(@Nullable Integer value) {
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableAuthorDto(value, this.firstName, this.lastName);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AuthorDto#getFirstName() firstName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for firstName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAuthorDto withFirstName(String value) {
    String newValue = Objects.requireNonNull(value, "firstName");
    if (this.firstName.equals(newValue)) return this;
    return new ImmutableAuthorDto(this.id, newValue, this.lastName);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AuthorDto#getLastName() lastName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAuthorDto withLastName(String value) {
    String newValue = Objects.requireNonNull(value, "lastName");
    if (this.lastName.equals(newValue)) return this;
    return new ImmutableAuthorDto(this.id, this.firstName, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAuthorDto} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAuthorDto
        && equalTo((ImmutableAuthorDto) another);
  }

  private boolean equalTo(ImmutableAuthorDto another) {
    return Objects.equals(id, another.id)
        && firstName.equals(another.firstName)
        && lastName.equals(another.lastName);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code firstName}, {@code lastName}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + firstName.hashCode();
    h += (h << 5) + lastName.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code AuthorDto} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "AuthorDto{"
        + "id=" + id
        + ", firstName=" + firstName
        + ", lastName=" + lastName
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link AuthorDto} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AuthorDto instance
   */
  public static ImmutableAuthorDto copyOf(AuthorDto instance) {
    if (instance instanceof ImmutableAuthorDto) {
      return (ImmutableAuthorDto) instance;
    }
    return ImmutableAuthorDto.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableAuthorDto ImmutableAuthorDto}.
   * <pre>
   * ImmutableAuthorDto.builder()
   *    .id(Integer | null) // nullable {@link AuthorDto#getId() id}
   *    .firstName(String) // required {@link AuthorDto#getFirstName() firstName}
   *    .lastName(String) // required {@link AuthorDto#getLastName() lastName}
   *    .build();
   * </pre>
   * @return A new ImmutableAuthorDto builder
   */
  public static ImmutableAuthorDto.Builder builder() {
    return new ImmutableAuthorDto.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableAuthorDto ImmutableAuthorDto}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "AuthorDto", generator = "Immutables")
  public static final class Builder {
    private static final long INIT_BIT_FIRST_NAME = 0x1L;
    private static final long INIT_BIT_LAST_NAME = 0x2L;
    private long initBits = 0x3L;

    private Integer id;
    private String firstName;
    private String lastName;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code AuthorDto} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(AuthorDto instance) {
      Objects.requireNonNull(instance, "instance");
      Integer idValue = instance.getId();
      if (idValue != null) {
        id(idValue);
      }
      firstName(instance.getFirstName());
      lastName(instance.getLastName());
      return this;
    }

    /**
     * Initializes the value for the {@link AuthorDto#getId() id} attribute.
     * @param id The value for id (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(@Nullable Integer id) {
      this.id = id;
      return this;
    }

    /**
     * Initializes the value for the {@link AuthorDto#getFirstName() firstName} attribute.
     * @param firstName The value for firstName 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("first_name")
    public final Builder firstName(String firstName) {
      this.firstName = Objects.requireNonNull(firstName, "firstName");
      initBits &= ~INIT_BIT_FIRST_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link AuthorDto#getLastName() lastName} attribute.
     * @param lastName The value for lastName 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("last_name")
    public final Builder lastName(String lastName) {
      this.lastName = Objects.requireNonNull(lastName, "lastName");
      initBits &= ~INIT_BIT_LAST_NAME;
      return this;
    }

    /**
     * Builds a new {@link ImmutableAuthorDto ImmutableAuthorDto}.
     * @return An immutable instance of AuthorDto
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableAuthorDto build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableAuthorDto(id, firstName, lastName);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_FIRST_NAME) != 0) attributes.add("firstName");
      if ((initBits & INIT_BIT_LAST_NAME) != 0) attributes.add("lastName");
      return "Cannot build AuthorDto, some of required attributes are not set " + attributes;
    }
  }
}
