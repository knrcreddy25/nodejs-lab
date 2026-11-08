import path from 'path';
import { fileURLToPath } from 'url';//reads only fileURLToPath from url module.

// Recreate __filename and __dirname
const filename = fileURLToPath(import.meta.url);
const dirname = path.dirname(filename);

console.log("File Name: " + path.basename(filename));
console.log("Full Path: " + filename);
console.log("Location: " + dirname);