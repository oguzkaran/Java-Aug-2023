package org.csystem.io.file.copy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class BackupAndCopy {
    private final Path m_src;
    private final Path m_dest;

    private void checkSourceFileIfExists() throws NoSuchFileException
    {
        if (Files.notExists(m_src))
            throw new NoSuchFileException(m_src.toString());
    }

    private void backup(String suffix) throws IOException
    {
        Files.move(m_dest, Path.of(m_dest + suffix), StandardCopyOption.REPLACE_EXISTING);
    }

    public BackupAndCopy(String src, String dest)
    {
        this(Path.of(src), Path.of(dest));
    }

    public BackupAndCopy(Path src, Path dest)
    {
        m_src = src;
        m_dest = dest;
    }

    public void copy(String suffix) throws IOException
    {
        copy(suffix, true);
    }

    public void copy(String suffix, boolean overwriteBackupFile) throws IOException
    {
        checkSourceFileIfExists();

        if (Files.exists(m_dest) && overwriteBackupFile)
            backup(suffix);

        Files.copy(m_src, m_dest, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.COPY_ATTRIBUTES);
    }
}
