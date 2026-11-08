
import EventEmitter from 'events';

// 1. Create emitter object
const emitter = new EventEmitter();

// 2. Register event (listener)
emitter.on('greet', (name) => {
    console.log("Hello " + name);
});

// 3. Trigger event
emitter.emit('greet', 'Arvin');
