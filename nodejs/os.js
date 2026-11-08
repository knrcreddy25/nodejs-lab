import os from 'os';
let currentOS = {
  name: os.type(),
  architecture: os.arch(),
  platform: os.platform(),
  release: os.release(),
  version: os.version(),
  freeMem: (os.freemem()/1024 ** 3).toFixed(2)+`GB`,
};
console.log(`details of current OS are:`);
console.log(currentOS);
