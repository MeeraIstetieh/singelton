package org.example.storage;
import lombok.*;

import java.util.*;
@ToString
@RequiredArgsConstructor (access=AccessLevel.PRIVATE)
@Builder
public final class StorageRequest {
    @Getter private final String filename;
    @Getter private final String content;
    @Getter
    @Builder.Default final String[] tags=new String[0];
    @Getter
    @Builder.Default private final boolean isEncrypted=false;
    @Getter
    @Builder.Default private final boolean isCompressed=false;
    @Getter
    @Builder.Default final Map<String, String> metadata = Collections.emptyMap();;
    @Getter
    @Builder.Default private final int priority=5;
    @Getter
    @Builder.Default private final int retryCount=3;


}
