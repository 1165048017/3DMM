package io.obj;

import java.io.FileNotFoundException;

import javax.media.j3d.BranchGroup;

import com.sun.j3d.loaders.*;
import com.sun.j3d.loaders.objectfile.ObjectFile;

import io.Importer;

public class ObjImporter extends Importer {

	@Override
	public BranchGroup doLoadObject(String file) throws FileNotFoundException, IncorrectFormatException, ParsingErrorException {
	   	ObjectFile f = new ObjectFile ();	    
	    return f.load (file).getSceneGroup();
	}

}