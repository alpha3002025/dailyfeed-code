package click.dailyfeed.code.global.web.page;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
@AllArgsConstructor
public class DailyfeedScrollPage<T>{
    private List<T> content;
    private int page;
    private int size;
}
