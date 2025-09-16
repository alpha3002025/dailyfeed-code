package click.dailyfeed.code.domain.image.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ImageExtensionType {
    PNG("PNG"),
    JPG("JPG");

    private final String extension;

    public String withDot(){
        return new StringBuilder().append(".").append(extension).toString();
    }

    public String withFileName(String fileName){
        return new StringBuilder().append(fileName).append(".").append(extension).toString();
    }
}
