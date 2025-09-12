package click.dailyfeed.code.global.web.page;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;

@Getter
public class DailyfeedPageable {
    private final int page;
    private final int size;
    private final String sort;

    @Builder(builderMethodName = "allArgsBuilder", builderClassName = "AllArgsBuilder")
    @JsonCreator
    public DailyfeedPageable(
            @JsonProperty("page") int page,
            @JsonProperty("size") int size,
            @JsonProperty("sort") String sort) {
        this.page = page;
        this.size = size;
        this.sort = sort;
    }

    @Builder(builderMethodName = "pageSizeBuilder", builderClassName = "PageSizeBuilder")
    public DailyfeedPageable(int page, int size) {
        this(page, size, null);
    }

    // 정적 팩토리 메서드들
    public static DailyfeedPageable of(int page, int size) {
        return new DailyfeedPageable(page, size, null);
    }

    public static DailyfeedPageable of(int page, int size, String sort) {
        return new DailyfeedPageable(page, size, sort);
    }

    public static DailyfeedPageable defaultPageable() {
        return new DailyfeedPageable(0, 10, null);
    }
}
