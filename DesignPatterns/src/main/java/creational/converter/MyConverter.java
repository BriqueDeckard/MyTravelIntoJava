package creational.converter;

import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class MyConverter<T, U> {
	private final Function<T, U> fromDto;
	private final Function<U, T> fromEntity;

	public MyConverter(final Function<T, U> fromDto, final Function<U, T> fromEntity) {
		this.fromDto = fromDto;
		this.fromEntity = fromEntity;
	}

	public final U convertFromDto(final T dto) {
		return fromDto.apply(dto);
	}

	public final T convertFromEntity(final U entity) {
		return fromEntity.apply(entity);
	}

	public final List<U> createFromDtos(final Collection<T> dtos) {
		return dtos.stream()
				.map(this::convertFromDto)
				.toList();
	}

	public final List<T> createFromEntities(final Collection<U> entities) {
		return entities.stream()
				.map(this::convertFromEntity)
				.toList();
	}
}
