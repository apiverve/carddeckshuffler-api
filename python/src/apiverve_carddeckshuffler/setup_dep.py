from setuptools import setup, find_packages

setup(
    name='apiverve_carddeckshuffler',
    version='1.1.13',
    packages=find_packages(),
    include_package_data=True,
    install_requires=[
        'requests',
        'setuptools'
    ],
    description='Card Deck Shuffler is a tool for shuffling standard playing card decks. It supports multiple decks, optional jokers, and different shuffling methods to generate randomized card sequences for games and simulations.',
    author='APIVerve',
    author_email='hello@apiverve.com',
    url='https://apiverve.com/marketplace/carddeckshuffler?utm_source=pypi&utm_medium=homepage',
    classifiers=[
        'Programming Language :: Python :: 3',
        'Operating System :: OS Independent',
    ],
    python_requires='>=3.6',
)
