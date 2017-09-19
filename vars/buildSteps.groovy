// Required constants
BUILT_DIR = 'Built'
ARCHIVE_DIR = '..\\SLSC_12201_CustomDevice'

// Useful constants
CUSTOM_DEVICE_PROJECT_PATH = "Source\\SLSC-12201 DIO.lvproj"

def build(lvVersion){
   echo 'Building the SLSC-12201 DIO Custom Device...'
   lvBuildAll(CUSTOM_DEVICE_PROJECT_PATH, lvVersion)
}

//This function should be a no-op until we can use a toolchain version of LV
//This is intended to be used to copy files into LV in an arbitrary location (i.e. not through an installer)
//on the build machine. We can't do that now, but don't want to have to update the pipeline
//and every single add-on to have this function once we have that capability
def setupLv(lvVersion){
   noop()
}

def prepareSource(lvVersion){
   copyProjectConfig(CUSTOM_DEVICE_PROJECT_PATH, lvVersion)
}

def syncDependencies(){
   noop()
}

def codegen(lvVersion){
   noop()
}

//this is required for dynamic loading of this file
return this;
