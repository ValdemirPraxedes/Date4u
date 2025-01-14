package com.jun.estudo.Date4u.interfaces.shell;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.util.unit.DataSize;

import com.jun.estudo.Date4u.core.FileSystem;

@ShellComponent
public class FsCommands {

	private final FileSystem fs = new FileSystem();
	
	@ShellMethod("Exibe o espaco livre minimo necessario ")
	public long minimumFreeDiskSpace() {
		return 1_000_000;
	}
	
	@ShellMethod("Exibe o espaco livre no disco")
	public String freeDiskSpace() {
		return DataSize.ofBytes(fs.getFreeDiskSpace()).toGigabytes() + " GB";
	}
	
	@ShellMethod("Converter para string minuscula")
	public String toLowercase(String input) {
		return input.toLowerCase();
	}
	
	
}
