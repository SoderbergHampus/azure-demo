import { Dogs } from './types';

export const getDogs = () => {
  return new Promise<Dogs>((resolve, reject) => {
    fetch('https://haso-app.azurewebsites.net/api/dogs')
      .then((res) => res.json())
      .then((data) => {
        console.log(data);
        const dogs: Dogs = data;
        resolve(dogs);
      })
      .catch(() => reject(Error('Something went wrong with fetch')));
  });

  // const response: Response = await fetch(
  //   'https://haso-app.azurewebsites.net/api/dogs'
  // );
  // const responseJson: Promise<Dog[]> = await response.json();
  // return responseJson;
};
