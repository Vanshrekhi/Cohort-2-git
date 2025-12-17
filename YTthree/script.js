let scene = new THREE.Scene(); //duniya baann gayi gay
let camera = new THREE.PerspectiveCamera(75, window.innerWidth / window.innerHeight, 0.1, 1000);
camera.position.z = 5;
scene.add(camera);

let box = new THREE.BoxGeometry(1, 1, 1);
let material = new THREE.MeshBasicMaterial({color: "red"});
let mesh = new THREE.Mesh(box, material);

mesh.scale.x = 2;
scene.add(mesh);

let canvas = document.querySelector("#draw");
let renderer = new THREE.WebGLRenderer({canvas});
renderer.setSize(window.innerWidth, window.innerHeight); 
renderer.render(scene, camera);