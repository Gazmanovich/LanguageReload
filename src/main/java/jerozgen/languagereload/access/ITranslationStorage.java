package jerozgen.languagereload.access;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.jetbrains.annotations.Nullable;

@Environment(EnvType.CLIENT)
public interface ITranslationStorage {
    @Nullable String languagereload_getTargetLanguage();

    void languagereload_setTargetLanguage(@Nullable String value);
}
