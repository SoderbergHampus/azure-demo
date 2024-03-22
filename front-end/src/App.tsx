import './App.css';
import DogViewer from './components/DogViewer';

function App() {
  return (
    <>
      <img
        src='https://jahrdogblob.blob.core.windows.net/jahr-blob-container/dog1.jpeg'
        alt=''
      />
      <DogViewer />
    </>
  );
}

export default App;
