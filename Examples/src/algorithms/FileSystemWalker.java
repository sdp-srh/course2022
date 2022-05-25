package algorithms;

import java.io.File;
import java.util.ArrayList;

public class FileSystemWalker {

	ArrayList<String> entries = new ArrayList<String>();
	int foldersCount;
	public FileSystemWalker() {
		entries = new ArrayList<String>();
		foldersCount = 0;
	}
	
	public static void main(String args[]) {
		FileSystemWalker fsw = new FileSystemWalker();
		fsw.readFolder(new File("C:\\srh\\github"));
		fsw.printEntries();
	}
	
	public void readFolder(File folder) {
		foldersCount++;
		File[] files = folder.listFiles();
		for (File f : files) {
			// we add each entry
			this.entries.add(f.getAbsolutePath());
			if (f.isDirectory()) {
				// read the sub folder content
				this.readFolder(f);
			}
		}
	}
	
	public void printEntries() {
		for (int i=0;i<this.entries.size();i++) {
			System.out.println(this.entries.get(i));
		}
		System.out.println("Files: "+(this.entries.size()-this.foldersCount));
		System.out.println("Folders: "+this.foldersCount);
	}
}
