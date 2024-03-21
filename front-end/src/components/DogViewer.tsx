import { useEffect, useState } from 'react';
import { Dogs } from '../types';
import { getDogs } from '../api';

const DogViewer = () => {
  const [dogs, setDogs] = useState<Dogs>();

  useEffect(() => {
    getDogs().then((res) =>
      res instanceof Error ? console.log(res.message) : setDogs(res)
    );
  }, []);

  // console.log(dogs);

  return (
    <>
      <h1>Our Dogs:</h1>{' '}
      {dogs !== undefined &&
        dogs.dogs.map((dog) => <div key={dog.id}>{dog.name}</div>)}
    </>
  );
};

export default DogViewer;
