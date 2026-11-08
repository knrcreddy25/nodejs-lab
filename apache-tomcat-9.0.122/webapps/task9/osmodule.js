
import os from 'os';

// 1. Get operating system details
console.log("OS Type: " + os.type());
console.log("Architecture: " + os.arch());
console.log("Platform: " + os.platform());
console.log("Release: " + os.release());
console.log("Version: " + os.version());

// 2. Free memory in GB
console.log("Free Memory: " +
    (os.freemem() / 1024 ** 3).toFixed(2) + " GB");
