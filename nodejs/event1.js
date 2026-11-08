import EventEmitter from 'events';
const myEmitter = new EventEmitter();

// 1. Register a listener using on()
myEmitter.on('greet', (name) => {
  console.log(`Hello ${name}`);
});

// 2. Trigger the event using .emit()
myEmitter.emit('greet', 'Arvin'); 
