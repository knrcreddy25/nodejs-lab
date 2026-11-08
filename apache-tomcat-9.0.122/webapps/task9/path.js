
import path from 'path';
import { fileURLToPath } from 'url';

const filename = fileURLToPath(import.meta.url);

// 2. Get directory path
const dirname = path.dirname(filename);

// 3. Display details
console.log("File Name: " + path.basename(filename));
console.log("Full Path: " + filename);
console.log("Directory: " + dirname);
