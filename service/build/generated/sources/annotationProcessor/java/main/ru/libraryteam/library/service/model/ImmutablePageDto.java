package ru.libraryteam.library.service.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link PageDto}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePageDto.builder()}.
 */
@Generated(from = "PageDto", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutablePageDto<T> implements PageDto<T> {
  private final List<T> items;
  private final int pageNumber;
  private final int totalPages;

  private ImmutablePageDto(List<T> items, int pageNumber, int totalPages) {
    this.items = items;
    this.pageNumber = pageNumber;
    this.totalPages = totalPages;
  }

  /**
   * @return The value of the {@code items} attribute
   */
  @Override
  public List<T> getItems() {
    return items;
  }

  /**
   * @return The value of the {@code pageNumber} attribute
   */
  @Override
  public int getPageNumber() {
    return pageNumber;
  }

  /**
   * @return The value of the {@code totalPages} attribute
   */
  @Override
  public int getTotalPages() {
    return totalPages;
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link PageDto#getItems() items}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final ImmutablePageDto<T> withItems(T... elements) {
    List<T> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutablePageDto<>(newValue, this.pageNumber, this.totalPages);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link PageDto#getItems() items}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of items elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePageDto<T> withItems(Iterable<? extends T> elements) {
    if (this.items == elements) return this;
    List<T> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutablePageDto<>(newValue, this.pageNumber, this.totalPages);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PageDto#getPageNumber() pageNumber} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for pageNumber
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePageDto<T> withPageNumber(int value) {
    if (this.pageNumber == value) return this;
    return new ImmutablePageDto<>(this.items, value, this.totalPages);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PageDto#getTotalPages() totalPages} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for totalPages
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePageDto<T> withTotalPages(int value) {
    if (this.totalPages == value) return this;
    return new ImmutablePageDto<>(this.items, this.pageNumber, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePageDto} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePageDto<?>
        && equalTo((ImmutablePageDto<?>) another);
  }

  private boolean equalTo(ImmutablePageDto<?> another) {
    return items.equals(another.items)
        && pageNumber == another.pageNumber
        && totalPages == another.totalPages;
  }

  /**
   * Computes a hash code from attributes: {@code items}, {@code pageNumber}, {@code totalPages}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + items.hashCode();
    h += (h << 5) + pageNumber;
    h += (h << 5) + totalPages;
    return h;
  }

  /**
   * Prints the immutable value {@code PageDto} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "PageDto{"
        + "items=" + items
        + ", pageNumber=" + pageNumber
        + ", totalPages=" + totalPages
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link PageDto} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param <T> generic parameter T
   * @param instance The instance to copy
   * @return A copied immutable PageDto instance
   */
  public static <T> ImmutablePageDto<T> copyOf(PageDto<T> instance) {
    if (instance instanceof ImmutablePageDto<?>) {
      return (ImmutablePageDto<T>) instance;
    }
    return ImmutablePageDto.<T>builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePageDto ImmutablePageDto}.
   * <pre>
   * ImmutablePageDto.&amp;lt;T&amp;gt;builder()
   *    .addItems|addAllItems(T) // {@link PageDto#getItems() items} elements
   *    .pageNumber(int) // required {@link PageDto#getPageNumber() pageNumber}
   *    .totalPages(int) // required {@link PageDto#getTotalPages() totalPages}
   *    .build();
   * </pre>
   * @param <T> generic parameter T
   * @return A new ImmutablePageDto builder
   */
  public static <T> ImmutablePageDto.Builder<T> builder() {
    return new ImmutablePageDto.Builder<>();
  }

  /**
   * Builds instances of type {@link ImmutablePageDto ImmutablePageDto}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "PageDto", generator = "Immutables")
  public static final class Builder<T> {
    private static final long INIT_BIT_PAGE_NUMBER = 0x1L;
    private static final long INIT_BIT_TOTAL_PAGES = 0x2L;
    private long initBits = 0x3L;

    private List<T> items = new ArrayList<T>();
    private int pageNumber;
    private int totalPages;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code PageDto} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder<T> from(PageDto<T> instance) {
      Objects.requireNonNull(instance, "instance");
      addAllItems(instance.getItems());
      pageNumber(instance.getPageNumber());
      totalPages(instance.getTotalPages());
      return this;
    }

    /**
     * Adds one element to {@link PageDto#getItems() items} list.
     * @param element A items element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder<T> addItems(T element) {
      this.items.add(Objects.requireNonNull(element, "items element"));
      return this;
    }

    /**
     * Adds elements to {@link PageDto#getItems() items} list.
     * @param elements An array of items elements
     * @return {@code this} builder for use in a chained invocation
     */
    @SafeVarargs @SuppressWarnings("varargs")
    public final Builder<T> addItems(T... elements) {
      for (T element : elements) {
        this.items.add(Objects.requireNonNull(element, "items element"));
      }
      return this;
    }


    /**
     * Sets or replaces all elements for {@link PageDto#getItems() items} list.
     * @param elements An iterable of items elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder<T> items(Iterable<? extends T> elements) {
      this.items.clear();
      return addAllItems(elements);
    }

    /**
     * Adds elements to {@link PageDto#getItems() items} list.
     * @param elements An iterable of items elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder<T> addAllItems(Iterable<? extends T> elements) {
      for (T element : elements) {
        this.items.add(Objects.requireNonNull(element, "items element"));
      }
      return this;
    }

    /**
     * Initializes the value for the {@link PageDto#getPageNumber() pageNumber} attribute.
     * @param pageNumber The value for pageNumber 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder<T> pageNumber(int pageNumber) {
      this.pageNumber = pageNumber;
      initBits &= ~INIT_BIT_PAGE_NUMBER;
      return this;
    }

    /**
     * Initializes the value for the {@link PageDto#getTotalPages() totalPages} attribute.
     * @param totalPages The value for totalPages 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder<T> totalPages(int totalPages) {
      this.totalPages = totalPages;
      initBits &= ~INIT_BIT_TOTAL_PAGES;
      return this;
    }

    /**
     * Builds a new {@link ImmutablePageDto ImmutablePageDto}.
     * @return An immutable instance of PageDto
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePageDto<T> build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePageDto<>(createUnmodifiableList(true, items), pageNumber, totalPages);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_PAGE_NUMBER) != 0) attributes.add("pageNumber");
      if ((initBits & INIT_BIT_TOTAL_PAGES) != 0) attributes.add("totalPages");
      return "Cannot build PageDto, some of required attributes are not set " + attributes;
    }
  }

  private static <T> List<T> createSafeList(Iterable<? extends T> iterable, boolean checkNulls, boolean skipNulls) {
    ArrayList<T> list;
    if (iterable instanceof Collection<?>) {
      int size = ((Collection<?>) iterable).size();
      if (size == 0) return Collections.emptyList();
      list = new ArrayList<>();
    } else {
      list = new ArrayList<>();
    }
    for (T element : iterable) {
      if (skipNulls && element == null) continue;
      if (checkNulls) Objects.requireNonNull(element, "element");
      list.add(element);
    }
    return list;
  }

  private static <T> List<T> createUnmodifiableList(boolean clone, List<T> list) {
    switch(list.size()) {
    case 0: return Collections.emptyList();
    case 1: return Collections.singletonList(list.get(0));
    default:
      if (clone) {
        return Collections.unmodifiableList(new ArrayList<>(list));
      } else {
        if (list instanceof ArrayList<?>) {
          ((ArrayList<?>) list).trimToSize();
        }
        return Collections.unmodifiableList(list);
      }
    }
  }
}
