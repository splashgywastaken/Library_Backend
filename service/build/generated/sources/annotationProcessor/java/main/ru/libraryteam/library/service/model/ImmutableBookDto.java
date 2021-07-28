package ru.libraryteam.library.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.immutables.value.Generated;
import org.springframework.lang.Nullable;

/**
 * Immutable implementation of {@link BookDto}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableBookDto.builder()}.
 */
@Generated(from = "BookDto", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutableBookDto implements BookDto {
  private final @Nullable Integer id;
  private final String bookName;
  private final Integer yearOfPublishing;
  private final String isbn;
  private final String ageRating;
  private final String language;
  private final Integer quantity;

  private ImmutableBookDto(
      @Nullable Integer id,
      String bookName,
      Integer yearOfPublishing,
      String isbn,
      String ageRating,
      String language,
      Integer quantity) {
    this.id = id;
    this.bookName = bookName;
    this.yearOfPublishing = yearOfPublishing;
    this.isbn = isbn;
    this.ageRating = ageRating;
    this.language = language;
    this.quantity = quantity;
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
   * @return The value of the {@code bookName} attribute
   */
  @JsonProperty("name")
  @Override
  public String getBookName() {
    return bookName;
  }

  /**
   * @return The value of the {@code yearOfPublishing} attribute
   */
  @JsonProperty("year_of_publ")
  @Override
  public Integer getYearOfPublishing() {
    return yearOfPublishing;
  }

  /**
   * @return The value of the {@code isbn} attribute
   */
  @JsonProperty("isbn")
  @Override
  public String getIsbn() {
    return isbn;
  }

  /**
   * @return The value of the {@code ageRating} attribute
   */
  @JsonProperty("age_rating")
  @Override
  public String getAgeRating() {
    return ageRating;
  }

  /**
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public String getLanguage() {
    return language;
  }

  /**
   * @return The value of the {@code quantity} attribute
   */
  @JsonProperty("quantity")
  @Override
  public Integer getQuantity() {
    return quantity;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link BookDto#getId() id} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for id (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableBookDto withId(@Nullable Integer value) {
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableBookDto(
        value,
        this.bookName,
        this.yearOfPublishing,
        this.isbn,
        this.ageRating,
        this.language,
        this.quantity);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link BookDto#getBookName() bookName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for bookName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableBookDto withBookName(String value) {
    String newValue = Objects.requireNonNull(value, "bookName");
    if (this.bookName.equals(newValue)) return this;
    return new ImmutableBookDto(
        this.id,
        newValue,
        this.yearOfPublishing,
        this.isbn,
        this.ageRating,
        this.language,
        this.quantity);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link BookDto#getYearOfPublishing() yearOfPublishing} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for yearOfPublishing
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableBookDto withYearOfPublishing(Integer value) {
    Integer newValue = Objects.requireNonNull(value, "yearOfPublishing");
    if (this.yearOfPublishing.equals(newValue)) return this;
    return new ImmutableBookDto(this.id, this.bookName, newValue, this.isbn, this.ageRating, this.language, this.quantity);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link BookDto#getIsbn() isbn} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for isbn
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableBookDto withIsbn(String value) {
    String newValue = Objects.requireNonNull(value, "isbn");
    if (this.isbn.equals(newValue)) return this;
    return new ImmutableBookDto(
        this.id,
        this.bookName,
        this.yearOfPublishing,
        newValue,
        this.ageRating,
        this.language,
        this.quantity);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link BookDto#getAgeRating() ageRating} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for ageRating
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableBookDto withAgeRating(String value) {
    String newValue = Objects.requireNonNull(value, "ageRating");
    if (this.ageRating.equals(newValue)) return this;
    return new ImmutableBookDto(
        this.id,
        this.bookName,
        this.yearOfPublishing,
        this.isbn,
        newValue,
        this.language,
        this.quantity);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link BookDto#getLanguage() language} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for language
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableBookDto withLanguage(String value) {
    String newValue = Objects.requireNonNull(value, "language");
    if (this.language.equals(newValue)) return this;
    return new ImmutableBookDto(
        this.id,
        this.bookName,
        this.yearOfPublishing,
        this.isbn,
        this.ageRating,
        newValue,
        this.quantity);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link BookDto#getQuantity() quantity} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for quantity
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableBookDto withQuantity(Integer value) {
    Integer newValue = Objects.requireNonNull(value, "quantity");
    if (this.quantity.equals(newValue)) return this;
    return new ImmutableBookDto(
        this.id,
        this.bookName,
        this.yearOfPublishing,
        this.isbn,
        this.ageRating,
        this.language,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableBookDto} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableBookDto
        && equalTo((ImmutableBookDto) another);
  }

  private boolean equalTo(ImmutableBookDto another) {
    return Objects.equals(id, another.id)
        && bookName.equals(another.bookName)
        && yearOfPublishing.equals(another.yearOfPublishing)
        && isbn.equals(another.isbn)
        && ageRating.equals(another.ageRating)
        && language.equals(another.language)
        && quantity.equals(another.quantity);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code bookName}, {@code yearOfPublishing}, {@code isbn}, {@code ageRating}, {@code language}, {@code quantity}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + bookName.hashCode();
    h += (h << 5) + yearOfPublishing.hashCode();
    h += (h << 5) + isbn.hashCode();
    h += (h << 5) + ageRating.hashCode();
    h += (h << 5) + language.hashCode();
    h += (h << 5) + quantity.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code BookDto} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "BookDto{"
        + "id=" + id
        + ", bookName=" + bookName
        + ", yearOfPublishing=" + yearOfPublishing
        + ", isbn=" + isbn
        + ", ageRating=" + ageRating
        + ", language=" + language
        + ", quantity=" + quantity
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link BookDto} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable BookDto instance
   */
  public static ImmutableBookDto copyOf(BookDto instance) {
    if (instance instanceof ImmutableBookDto) {
      return (ImmutableBookDto) instance;
    }
    return ImmutableBookDto.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableBookDto ImmutableBookDto}.
   * <pre>
   * ImmutableBookDto.builder()
   *    .id(Integer | null) // nullable {@link BookDto#getId() id}
   *    .bookName(String) // required {@link BookDto#getBookName() bookName}
   *    .yearOfPublishing(Integer) // required {@link BookDto#getYearOfPublishing() yearOfPublishing}
   *    .isbn(String) // required {@link BookDto#getIsbn() isbn}
   *    .ageRating(String) // required {@link BookDto#getAgeRating() ageRating}
   *    .language(String) // required {@link BookDto#getLanguage() language}
   *    .quantity(Integer) // required {@link BookDto#getQuantity() quantity}
   *    .build();
   * </pre>
   * @return A new ImmutableBookDto builder
   */
  public static ImmutableBookDto.Builder builder() {
    return new ImmutableBookDto.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableBookDto ImmutableBookDto}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "BookDto", generator = "Immutables")
  public static final class Builder {
    private static final long INIT_BIT_BOOK_NAME = 0x1L;
    private static final long INIT_BIT_YEAR_OF_PUBLISHING = 0x2L;
    private static final long INIT_BIT_ISBN = 0x4L;
    private static final long INIT_BIT_AGE_RATING = 0x8L;
    private static final long INIT_BIT_LANGUAGE = 0x10L;
    private static final long INIT_BIT_QUANTITY = 0x20L;
    private long initBits = 0x3fL;

    private Integer id;
    private String bookName;
    private Integer yearOfPublishing;
    private String isbn;
    private String ageRating;
    private String language;
    private Integer quantity;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code BookDto} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(BookDto instance) {
      Objects.requireNonNull(instance, "instance");
      Integer idValue = instance.getId();
      if (idValue != null) {
        id(idValue);
      }
      bookName(instance.getBookName());
      yearOfPublishing(instance.getYearOfPublishing());
      isbn(instance.getIsbn());
      ageRating(instance.getAgeRating());
      language(instance.getLanguage());
      quantity(instance.getQuantity());
      return this;
    }

    /**
     * Initializes the value for the {@link BookDto#getId() id} attribute.
     * @param id The value for id (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(@Nullable Integer id) {
      this.id = id;
      return this;
    }

    /**
     * Initializes the value for the {@link BookDto#getBookName() bookName} attribute.
     * @param bookName The value for bookName 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("name")
    public final Builder bookName(String bookName) {
      this.bookName = Objects.requireNonNull(bookName, "bookName");
      initBits &= ~INIT_BIT_BOOK_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link BookDto#getYearOfPublishing() yearOfPublishing} attribute.
     * @param yearOfPublishing The value for yearOfPublishing 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("year_of_publ")
    public final Builder yearOfPublishing(Integer yearOfPublishing) {
      this.yearOfPublishing = Objects.requireNonNull(yearOfPublishing, "yearOfPublishing");
      initBits &= ~INIT_BIT_YEAR_OF_PUBLISHING;
      return this;
    }

    /**
     * Initializes the value for the {@link BookDto#getIsbn() isbn} attribute.
     * @param isbn The value for isbn 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("isbn")
    public final Builder isbn(String isbn) {
      this.isbn = Objects.requireNonNull(isbn, "isbn");
      initBits &= ~INIT_BIT_ISBN;
      return this;
    }

    /**
     * Initializes the value for the {@link BookDto#getAgeRating() ageRating} attribute.
     * @param ageRating The value for ageRating 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("age_rating")
    public final Builder ageRating(String ageRating) {
      this.ageRating = Objects.requireNonNull(ageRating, "ageRating");
      initBits &= ~INIT_BIT_AGE_RATING;
      return this;
    }

    /**
     * Initializes the value for the {@link BookDto#getLanguage() language} attribute.
     * @param language The value for language 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("language")
    public final Builder language(String language) {
      this.language = Objects.requireNonNull(language, "language");
      initBits &= ~INIT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the value for the {@link BookDto#getQuantity() quantity} attribute.
     * @param quantity The value for quantity 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("quantity")
    public final Builder quantity(Integer quantity) {
      this.quantity = Objects.requireNonNull(quantity, "quantity");
      initBits &= ~INIT_BIT_QUANTITY;
      return this;
    }

    /**
     * Builds a new {@link ImmutableBookDto ImmutableBookDto}.
     * @return An immutable instance of BookDto
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableBookDto build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableBookDto(id, bookName, yearOfPublishing, isbn, ageRating, language, quantity);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_BOOK_NAME) != 0) attributes.add("bookName");
      if ((initBits & INIT_BIT_YEAR_OF_PUBLISHING) != 0) attributes.add("yearOfPublishing");
      if ((initBits & INIT_BIT_ISBN) != 0) attributes.add("isbn");
      if ((initBits & INIT_BIT_AGE_RATING) != 0) attributes.add("ageRating");
      if ((initBits & INIT_BIT_LANGUAGE) != 0) attributes.add("language");
      if ((initBits & INIT_BIT_QUANTITY) != 0) attributes.add("quantity");
      return "Cannot build BookDto, some of required attributes are not set " + attributes;
    }
  }
}
